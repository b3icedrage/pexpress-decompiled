package defpackage;

/* JADX INFO: renamed from: qJ1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6117qJ1<V> extends AbstractC4575j0<V> {
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final boolean j(V v) {
        if (v == null) {
            v = (V) AbstractC4575j0.k;
        }
        if (!AbstractC4575j0.j.b(this, null, v)) {
            return false;
        }
        AbstractC4575j0.b(this);
        return true;
    }

    public final boolean k(Throwable th) {
        if (!AbstractC4575j0.j.b(this, null, new AbstractC4575j0.c(th))) {
            return false;
        }
        AbstractC4575j0.b(this);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    public final boolean l(PQ0<? extends V> pq0) {
        AbstractC4575j0.c cVar;
        pq0.getClass();
        Object obj = this.d;
        if (obj != null) {
            if (obj instanceof AbstractC4575j0.b) {
                pq0.cancel(((AbstractC4575j0.b) obj).a);
            }
        } else if (pq0.isDone()) {
            if (AbstractC4575j0.j.b(this, null, AbstractC4575j0.e(pq0))) {
                AbstractC4575j0.b(this);
                return true;
            }
        } else {
            AbstractC4575j0.f fVar = new AbstractC4575j0.f(this, pq0);
            if (AbstractC4575j0.j.b(this, null, fVar)) {
                try {
                    pq0.f(fVar, EnumC7943z10.d);
                    return true;
                } catch (Throwable th) {
                    try {
                        cVar = new AbstractC4575j0.c(th);
                    } catch (Throwable unused) {
                        cVar = AbstractC4575j0.c.b;
                    }
                    AbstractC4575j0.j.b(this, fVar, cVar);
                    return true;
                }
            }
            obj = this.d;
            if (obj instanceof AbstractC4575j0.b) {
                pq0.cancel(((AbstractC4575j0.b) obj).a);
            }
        }
        return false;
    }
}
