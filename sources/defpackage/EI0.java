package defpackage;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EI0 {

    public static final class a extends EI0 {

        @NotNull
        public final Field a;

        public a(@NotNull Field field) {
            Intrinsics.checkNotNullParameter(field, "field");
            this.a = field;
        }

        @Override // defpackage.EI0
        @NotNull
        public final String a() {
            StringBuilder sb = new StringBuilder();
            Field field = this.a;
            String name = field.getName();
            Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
            sb.append(C3123cI0.a(name));
            sb.append("()");
            Class<?> type = field.getType();
            Intrinsics.checkNotNullExpressionValue(type, "getType(...)");
            sb.append(C4753jp1.b(type));
            return sb.toString();
        }
    }

    public static final class b extends EI0 {

        @NotNull
        public final Method a;

        @Nullable
        public final Method b;

        public b(@NotNull Method getterMethod, @Nullable Method method) {
            Intrinsics.checkNotNullParameter(getterMethod, "getterMethod");
            this.a = getterMethod;
            this.b = method;
        }

        @Override // defpackage.EI0
        @NotNull
        public final String a() {
            return C1952Ru.e(this.a);
        }
    }

    public static final class c extends EI0 {

        @NotNull
        public final C2850b00 a;

        @NotNull
        public final C3637ek1 b;

        @NotNull
        public final FI0.c c;

        @NotNull
        public final InterfaceC5848p21 d;

        @NotNull
        public final C2656a72 e;

        @NotNull
        public final String f;

        public c(@NotNull C2850b00 descriptor, @NotNull C3637ek1 proto, @NotNull FI0.c signature, @NotNull InterfaceC5848p21 nameResolver, @NotNull C2656a72 typeTable) {
            String string;
            BI0 bi0;
            String string2;
            Intrinsics.checkNotNullParameter(descriptor, "descriptor");
            Intrinsics.checkNotNullParameter(proto, "proto");
            Intrinsics.checkNotNullParameter(signature, "signature");
            Intrinsics.checkNotNullParameter(nameResolver, "nameResolver");
            Intrinsics.checkNotNullParameter(typeTable, "typeTable");
            this.a = descriptor;
            this.b = proto;
            this.c = signature;
            this.d = nameResolver;
            this.e = typeTable;
            if ((signature.e & 4) == 4) {
                string2 = nameResolver.getString(signature.i.g) + nameResolver.getString(signature.i.h);
            } else {
                AbstractC7583xI0.a aVarB = GI0.b(proto, nameResolver, typeTable, true);
                if (aVarB == null) {
                    throw new C3761fL0("No field signature for property: " + descriptor);
                }
                StringBuilder sb = new StringBuilder();
                sb.append(C3123cI0.a(aVarB.a));
                InterfaceC4675jU interfaceC4675jUE = descriptor.e();
                Intrinsics.checkNotNullExpressionValue(interfaceC4675jUE, "getContainingDeclaration(...)");
                if (Intrinsics.a(descriptor.d(), C5323mZ.d) && (interfaceC4675jUE instanceof FZ)) {
                    C2077Tj1 c2077Tj1 = ((FZ) interfaceC4675jUE).i;
                    AbstractC0673Bk0.e<C2077Tj1, Integer> classModuleName = FI0.i;
                    Intrinsics.checkNotNullExpressionValue(classModuleName, "classModuleName");
                    Integer num = (Integer) C5998pk1.a(c2077Tj1, classModuleName);
                    String name = (num == null || (name = nameResolver.getString(num.intValue())) == null) ? "main" : name;
                    StringBuilder sb2 = new StringBuilder("$");
                    Regex regex = C6477s21.a;
                    Intrinsics.checkNotNullParameter(name, "name");
                    sb2.append(C6477s21.a.replace(name, "_"));
                    string = sb2.toString();
                } else if (!Intrinsics.a(descriptor.d(), C5323mZ.a) || !(interfaceC4675jUE instanceof InterfaceC2392Xa1) || (bi0 = descriptor.I) == null || bi0.c == null) {
                    string = "";
                } else {
                    StringBuilder sb3 = new StringBuilder("$");
                    String strD = bi0.b.d();
                    Intrinsics.checkNotNullExpressionValue(strD, "getInternalName(...)");
                    C5638o21 c5638o21K = C5638o21.k(StringsKt.W('/', strD, strD));
                    Intrinsics.checkNotNullExpressionValue(c5638o21K, "identifier(...)");
                    sb3.append(c5638o21K.e());
                    string = sb3.toString();
                }
                sb.append(string);
                sb.append("()");
                sb.append(aVarB.b);
                string2 = sb.toString();
            }
            this.f = string2;
        }

        @Override // defpackage.EI0
        @NotNull
        public final String a() {
            return this.f;
        }
    }

    public static final class d extends EI0 {

        @NotNull
        public final AbstractC7373wI0.e a;

        @Nullable
        public final AbstractC7373wI0.e b;

        public d(@NotNull AbstractC7373wI0.e getterSignature, @Nullable AbstractC7373wI0.e eVar) {
            Intrinsics.checkNotNullParameter(getterSignature, "getterSignature");
            this.a = getterSignature;
            this.b = eVar;
        }

        @Override // defpackage.EI0
        @NotNull
        public final String a() {
            return this.a.b;
        }
    }

    @NotNull
    public abstract String a();
}
