package defpackage;

import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: renamed from: ha1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4227ha1 implements InterfaceC3129cK0 {
    public final C6667sx b = new C6667sx();

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$ArrayArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.InterfaceC3129cK0
    public final void b(@NonNull MessageDigest messageDigest) {
        int i = 0;
        while (true) {
            C6667sx c6667sx = this.b;
            if (i >= c6667sx.g) {
                return;
            }
            Z91 z91 = (Z91) c6667sx.i(i);
            Object objM = this.b.m(i);
            Z91.b<T> bVar = z91.b;
            if (z91.d == null) {
                z91.d = z91.c.getBytes(InterfaceC3129cK0.a);
            }
            bVar.a(z91.d, objM, messageDigest);
            i++;
        }
    }

    public final <T> T c(@NonNull Z91<T> z91) {
        C6667sx c6667sx = this.b;
        return c6667sx.containsKey(z91) ? (T) c6667sx.getOrDefault(z91, null) : z91.a;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final boolean equals(Object obj) {
        if (obj instanceof C4227ha1) {
            return this.b.equals(((C4227ha1) obj).b);
        }
        return false;
    }

    @Override // defpackage.InterfaceC3129cK0
    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return "Options{values=" + this.b + '}';
    }
}
