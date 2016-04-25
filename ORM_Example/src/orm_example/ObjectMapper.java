/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orm_example;

import java.lang.reflect.Field;

/**
 *
 * @author jmccarthy
 */
public class ObjectMapper {

    public int id = 1;

    public String getClassName() {
        return this.getClass().getSimpleName();
    }

    public void printMyFields() {
        try {
            System.out.println("Here");
            Class<?> objClass = this.getClass();
            System.out.println(objClass);
            Field[] fields = objClass.getFields();
            System.out.println(fields.length);
            for (Field field : fields) {
                System.out.println("Johnny" + field);
                String name = field.getName();
                Object value = field.get(this);
                System.out.println(name);
                System.out.println(value.getClass());
                //System.out.println(name + ": " + value.toString());
            }
        } catch (Exception e) {
            //e.printStackTrace();
        }
    }

    public void save() {
        if (this.id == 0) {
            // new object
            create();
        } else {
            update();
        }
    }

    public void create() {
        try {
            String insert_fields = "";
            String insert_values = "";
            int counter = 0;

            Class<?> objClass = this.getClass();
            String db_tableName = objClass.getSimpleName() + "s";
            Field[] fields = objClass.getFields();

            //for (Field field : fields) {
            for (int i = 0; i < fields.length - 1; i++) {
                String name = fields[i].getName();
                Object value = fields[i].get(this);

                if (counter == 0) {
                    insert_fields = insert_fields + name;
                } else {
                    insert_fields = insert_fields + ", " + name;
                }

                switch (value.getClass().toString()) {
                    case "class java.lang.String":
                        if (counter == 0) {
                            insert_values = insert_values + "'" + value.toString() + "'";
                        } else {
                            insert_values = insert_values + ", " + "'" + value.toString() + "'";
                        }
                        break;
                    case "class java.lang.Integer":
                        if (counter == 0) {
                            insert_values = insert_values + value.toString();
                        } else {
                            insert_values = insert_values + ", " + value.toString();
                        }
                        break;
                    default:
                        // Something went wrong if we got here!!
                        break;
                }
                counter += 1;
            }
            System.out.println("insert into " + db_tableName + " (" + insert_fields + ") values (" + insert_values + ");");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void update() {
        try {
            String update_cols = "";
            int counter = 0;

            Class<?> objClass = this.getClass();
            String db_tableName = objClass.getSimpleName() + "s";
            Field[] fields = objClass.getFields();

            //for (Field field : fields) {
            for (int i = 0; i < fields.length - 1; i++) {
                String name = fields[i].getName();
                String fieldValue = "";
                Object value = fields[i].get(this);

                switch (value.getClass().toString()) {
                    case "class java.lang.String":
                        fieldValue = name + " = '" + value.toString() + "'";
                        break;
                    case "class java.lang.Integer":
                        fieldValue = name + " = " + value.toString();
                        break;
                    default:
                        // Something went wrong if we got here!!
                        break;
                }

                if (counter == 0) {
                    update_cols = fieldValue;
                } else {
                    update_cols = update_cols + ", " + fieldValue;
                }
                counter += 1;
            }
            System.out.println("UPDATE " + db_tableName + " SET " + update_cols + " WHERE id=" + this.id + ";");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void delete() {
        Class<?> objClass = this.getClass();
        String db_tableName = objClass.getSimpleName() + "s";
        System.out.println("DELETE FROM " + db_tableName + " WHERE id=" + this.id + ";");
        //this.delete();
    }

    public static void find(String type, int id) {

    }
    
    public static void findAll(String type) {

    }
}
