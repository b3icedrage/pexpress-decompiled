package defpackage;

/* JADX INFO: renamed from: Ag0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0583Ag0<T, K> extends AbstractC4317i0<T, T> {
    public final C3636ek0.f g;
    public final OV h;

    /* JADX INFO: renamed from: Ag0$a */
    public static final class a<T, K> extends AbstractC3659er<T, T> {
        public final C3636ek0.f i;
        public final OV j;
        public K k;
        public boolean l;

        public a(InterfaceC2913bI interfaceC2913bI, C3636ek0.f fVar, OV ov) {
            super(interfaceC2913bI);
            this.i = fVar;
            this.j = ov;
        }

        /* JADX WARN: Multi-variable type inference failed */
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
        @Override // defpackage.InterfaceC2913bI
        public final boolean c(T t) {
            if (this.h) {
                return false;
            }
            InterfaceC1518Mg0 interfaceC1518Mg0 = this.d;
            try {
                this.i.getClass();
                if (this.l) {
                    boolean zA = this.j.a(this.k, t);
                    this.k = t;
                    if (zA) {
                        return false;
                    }
                } else {
                    this.l = true;
                    this.k = t;
                }
                interfaceC1518Mg0.d(t);
                return true;
            } catch (Throwable th) {
                b(th);
                return true;
            }
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void d(T t) {
            if (c(t)) {
                return;
            }
            this.e.s(1L);
        }

        @Override // defpackage.AbstractC3659er, defpackage.InterfaceC1067Gl1
        public final int e() {
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [K, T, java.lang.Object] */
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
        @Override // defpackage.InterfaceC4863kM1
        public final T poll() {
            while (true) {
                T tPoll = this.g.poll();
                if (tPoll == 0) {
                    return null;
                }
                this.i.getClass();
                if (!this.l) {
                    this.l = true;
                    this.k = tPoll;
                    return tPoll;
                }
                if (!this.j.a(this.k, tPoll)) {
                    this.k = tPoll;
                    return tPoll;
                }
                this.k = tPoll;
                this.e.s(1L);
            }
        }
    }

    /* JADX INFO: renamed from: Ag0$b */
    public static final class b<T, K> extends AbstractC3869fr<T, T> implements InterfaceC2913bI<T> {
        public final C3636ek0.f i;
        public final OV j;
        public K k;
        public boolean l;

        public b(InterfaceC1518Mg0 interfaceC1518Mg0, C3636ek0.f fVar, OV ov) {
            super(interfaceC1518Mg0);
            this.i = fVar;
            this.j = ov;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // defpackage.InterfaceC2913bI
        public final boolean c(T t) {
            if (this.h) {
                return false;
            }
            InterfaceC1518Mg0 interfaceC1518Mg0 = this.d;
            try {
                this.i.getClass();
                if (this.l) {
                    boolean zA = this.j.a(this.k, t);
                    this.k = t;
                    if (zA) {
                        return false;
                    }
                } else {
                    this.l = true;
                    this.k = t;
                }
                interfaceC1518Mg0.d(t);
                return true;
            } catch (Throwable th) {
                C4994l.j(th);
                this.e.cancel();
                a(th);
                return true;
            }
        }

        @Override // defpackage.InterfaceC6359rU1
        public final void d(T t) {
            if (c(t)) {
                return;
            }
            this.e.s(1L);
        }

        @Override // defpackage.AbstractC3869fr, defpackage.InterfaceC1067Gl1
        public final int e() {
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v1, types: [K, T, java.lang.Object] */
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
        @Override // defpackage.InterfaceC4863kM1
        public final T poll() {
            while (true) {
                T tPoll = this.g.poll();
                if (tPoll == 0) {
                    return null;
                }
                this.i.getClass();
                if (!this.l) {
                    this.l = true;
                    this.k = tPoll;
                    return tPoll;
                }
                if (!this.j.a(this.k, tPoll)) {
                    this.k = tPoll;
                    return tPoll;
                }
                this.k = tPoll;
                this.e.s(1L);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0583Ag0(AbstractC7871yg0 abstractC7871yg0, OV ov) {
        super(abstractC7871yg0);
        C3636ek0.f fVar = C3636ek0.a;
        this.g = fVar;
        this.h = ov;
    }

    @Override // defpackage.AbstractC7871yg0
    public final void h(InterfaceC1518Mg0 interfaceC1518Mg0) {
        boolean z = interfaceC1518Mg0 instanceof InterfaceC2913bI;
        OV ov = this.h;
        C3636ek0.f fVar = this.g;
        AbstractC7871yg0<T> abstractC7871yg0 = this.e;
        if (z) {
            abstractC7871yg0.g(new a((InterfaceC2913bI) interfaceC1518Mg0, fVar, ov));
        } else {
            abstractC7871yg0.g(new b(interfaceC1518Mg0, fVar, ov));
        }
    }
}
