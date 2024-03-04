import dart.common.ExtraBindingTarget;
import dart.common.ExtraInjection;
import dart.common.FieldBinding;
import java.util.Collection;

  public String brewJava() {
    TypeSpec.Builder binderTypeSpec =
        TypeSpec.classBuilder(binderClassName()).addModifiers(Modifier.PUBLIC);
    emitBind(binderTypeSpec);
    JavaFile javaFile =


    for (FieldBinding fieldBinding : fieldBindings) {
      builder.addCode("target.$L = ", fieldBinding.getName());

      if (fieldBinding.isParcel()) {
        builder.addCode("org.parceler.Parcels.unwrap((android.os.Parcelable) object);\n");
      } else {
        emitCast(builder, fieldBinding.getType());
        builder.addCode("object;\n");


        JavaFile.builder(target.classPackage, binderTypeSpec.build())
            .addFileComment("Generated code from Dart. Do not modify!")
            .build();
    return javaFile.toString();
  }

