package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.ConfigUpdater$start$2", f = "ConfigUpdater.kt", l = {34, 37}, m = "invokeSuspend")
public final class BI extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public FF d;
    public int e;
    public final /* synthetic */ CI g;

    @InterfaceC3368dU(c = "com.base.core.backend.updaters.ConfigUpdater$start$2$1", f = "ConfigUpdater.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function1<JM<? super Boolean>, Object> {
        public final /* synthetic */ FF d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FF ff, JM<? super a> jm) {
            super(1, jm);
            this.d = ff;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(JM<?> jm) {
            return new a(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(JM<? super Boolean> jm) {
            return ((a) create(jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            return Boolean.valueOf(this.d.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BI(CI ci, JM<? super BI> jm) {
        super(2, jm);
        this.g = ci;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new BI(this.g, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((BI) create(kn, jm)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, java.util.List] */
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
    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        FF ff;
        MN mn = MN.d;
        int i = this.e;
        if (i == 0) {
            C1795Pt1.b(obj);
            C4250hg0 c4250hg0 = new C4250hg0(this.g.a.b, 0);
            this.e = 1;
            obj = C4466ii.o(c4250hg0, this);
            if (obj != mn) {
            }
            return mn;
        }
        if (i == 1) {
            C1795Pt1.b(obj);
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ff = this.d;
            C1795Pt1.b(obj);
        }
        this.g.e = ff;
        return Unit.a;
        FF ff2 = (FF) obj;
        if (Intrinsics.a(ff2, this.g.e)) {
            return Unit.a;
        }
        this.g.b.a(ff2.C);
        AbstractC5045lD0 abstractC5045lD0 = this.g.c;
        a aVar = new a(ff2, null);
        this.d = ff2;
        this.e = 2;
        abstractC5045lD0.getClass();
        if (AbstractC5045lD0.o(abstractC5045lD0, aVar, this) != mn) {
            ff = ff2;
            this.g.e = ff;
            return Unit.a;
        }
        return mn;
    }
}
