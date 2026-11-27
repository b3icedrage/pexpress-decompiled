package defpackage;

import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: o62, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5655o62 extends AbstractC2420Xk<AbstractC5022l62<?>, AbstractC5022l62<?>> {

    @NotNull
    public static final a e = new a();

    @NotNull
    public static final C5655o62 g = new C5655o62(C5653o60.d);

    /* JADX INFO: renamed from: o62$a */
    public static final class a extends S62<AbstractC5022l62<?>, AbstractC5022l62<?>> {
        @NotNull
        public static C5655o62 a(@NotNull List attributes) {
            Intrinsics.checkNotNullParameter(attributes, "attributes");
            return attributes.isEmpty() ? C5655o62.g : new C5655o62(attributes);
        }

        public final int b(@NotNull ConcurrentHashMap concurrentHashMap, @NotNull String key, @NotNull JC compute) {
            int iIntValue;
            Intrinsics.checkNotNullParameter(concurrentHashMap, "<this>");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(compute, "compute");
            Integer num = (Integer) concurrentHashMap.get(key);
            if (num != null) {
                return num.intValue();
            }
            synchronized (concurrentHashMap) {
                try {
                    Integer num2 = (Integer) concurrentHashMap.get(key);
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        Object objInvoke = compute.invoke(key);
                        concurrentHashMap.putIfAbsent(key, Integer.valueOf(((Number) objInvoke).intValue()));
                        iIntValue = ((Number) objInvoke).intValue();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return iIntValue;
        }
    }

    public C5655o62() {
        throw null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public C5655o62(List<? extends AbstractC5022l62<?>> list) {
        C3502e60 arrayMap = C3502e60.d;
        Intrinsics.c(arrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        Intrinsics.checkNotNullParameter(arrayMap, "arrayMap");
        this.d = arrayMap;
        for (AbstractC5022l62<?> value : list) {
            RI0<? extends T> tClass = value.b();
            Intrinsics.checkNotNullParameter(tClass, "tClass");
            Intrinsics.checkNotNullParameter(value, "value");
            String keyQualifiedName = tClass.d();
            Intrinsics.checkNotNull(keyQualifiedName);
            Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
            Intrinsics.checkNotNullParameter(value, "value");
            a aVar = e;
            aVar.getClass();
            Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
            int iB = aVar.b(aVar.a, keyQualifiedName, new JC(aVar, 1));
            int iB2 = this.d.b();
            if (iB2 != 0) {
                if (iB2 == 1) {
                    Object obj = this.d;
                    Intrinsics.c(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                    C7345w91 c7345w91 = (C7345w91) obj;
                    int i = c7345w91.e;
                    if (i == iB) {
                        this.d = new C7345w91(iB, value);
                    } else {
                        C0591Aj c0591Aj = new C0591Aj();
                        c0591Aj.d = new Object[20];
                        c0591Aj.e = 0;
                        this.d = c0591Aj;
                        c0591Aj.c(i, c7345w91.d);
                    }
                }
                this.d.c(iB, value);
            } else {
                this.d = new C7345w91(iB, value);
            }
        }
    }
}
