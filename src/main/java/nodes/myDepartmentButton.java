package nodes;

import javafx.scene.control.Button;


public class myDepartmentButton extends Button {
    public myDepartmentButton(String departmentName , int layoutY) {
       this.setText(departmentName);
//       this.setStyle(".button {\n" +
//               "    -fx-text-fill: white;\n" +
//               "    -fx-font-family: \"Arial Narrow\";\n" +
//               "    -fx-font-weight: bold;\n" +
//               "    -fx-background-color: linear-gradient(#61a2b1, #2A5058);\n" +
//               "    -fx-effect: dropshadow( three-pass-box , rgba(0,0,0,0.6) , 5, 0.0 , 0 , 1 );\n" +
//               "}\n" +
//               ".button:hover {\n" +
//               " -fx-background-color: linear-gradient(#2A5058, #61a2b1);\n" +
//               " }");
       this.setMaxSize(164,32);
       this.setPrefSize(164,32);
       this.setLayoutX(9);
       this.setLayoutY(layoutY + 32);
       this.setHover(true);



    }
}
