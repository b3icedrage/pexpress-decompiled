package defpackage;

import kotlin.Unit;

/* JADX INFO: renamed from: Wv1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2351Wv1<T> implements InterfaceC6606sf0 {
    public final /* synthetic */ C2455Xv1 d;

    /* JADX INFO: renamed from: Wv1$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.robot.common.utils.RobotCommonViewsVisibilityControllerBase$startObservingRobotState$2", f = "RobotCommonViewsVisibilityControllerBase.kt", l = {62}, m = "emit")
    public static final class a extends LM {
        public C2351Wv1 d;
        public EnumC4105gz1 e;
        public /* synthetic */ Object g;
        public final /* synthetic */ C2351Wv1<T> h;
        public int i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(C2351Wv1<? super T> c2351Wv1, JM<? super a> jm) {
            super(jm);
            this.h = c2351Wv1;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            this.g = obj;
            this.i |= Integer.MIN_VALUE;
            return this.h.a(null, this);
        }
    }

    public C2351Wv1(C2455Xv1 c2455Xv1) {
        this.d = c2455Xv1;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.InterfaceC6606sf0
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Object a(EnumC4105gz1 enumC4105gz1, JM<? super Unit> jm) {
        a aVar;
        C2351Wv1<T> c2351Wv1;
        if (jm instanceof a) {
            aVar = (a) jm;
            int i = aVar.i;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.i = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, jm);
            }
        } else {
            aVar = new a(this, jm);
        }
        Object obj = aVar.g;
        MN mn = MN.d;
        int i2 = aVar.i;
        if (i2 == 0) {
            C1795Pt1.b(obj);
            C2455Xv1 c2455Xv1 = this.d;
            EnumC3495e41 enumC3495e41 = (EnumC3495e41) c2455Xv1.a.r.getValue();
            if (enumC3495e41 != null && C7652xe.g(enumC3495e41)) {
                aVar.d = this;
                aVar.e = enumC4105gz1;
                aVar.i = 1;
                if (c2455Xv1.c.q(false, aVar) == mn) {
                    return mn;
                }
            }
            c2351Wv1 = this;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            enumC4105gz1 = aVar.e;
            c2351Wv1 = aVar.d;
            C1795Pt1.b(obj);
        }
        C2455Xv1 c2455Xv2 = c2351Wv1.d;
        GP1 gp1 = c2455Xv2.e;
        EnumC4105gz1 enumC4105gz2 = EnumC4105gz1.g;
        Boolean boolValueOf = Boolean.valueOf(enumC4105gz1 != enumC4105gz2);
        gp1.getClass();
        gp1.m(null, boolValueOf);
        Boolean boolValueOf2 = Boolean.valueOf(enumC4105gz1 != enumC4105gz2);
        GP1 gp2 = c2455Xv2.k;
        gp2.getClass();
        gp2.m(null, boolValueOf2);
        EnumC4105gz1 enumC4105gz3 = EnumC4105gz1.d;
        Boolean boolValueOf3 = Boolean.valueOf(enumC4105gz1 == enumC4105gz3);
        GP1 gp3 = c2455Xv2.j;
        gp3.getClass();
        gp3.m(null, boolValueOf3);
        Boolean boolValueOf4 = Boolean.valueOf(enumC4105gz1 == enumC4105gz3);
        GP1 gp4 = c2455Xv2.f;
        gp4.getClass();
        gp4.m(null, boolValueOf4);
        Boolean boolValueOf5 = Boolean.valueOf(enumC4105gz1 == enumC4105gz3);
        GP1 gp5 = c2455Xv2.i;
        gp5.getClass();
        gp5.m(null, boolValueOf5);
        Boolean boolValueOf6 = Boolean.valueOf(enumC4105gz1 == enumC4105gz2);
        GP1 gp6 = c2455Xv2.d;
        gp6.getClass();
        gp6.m(null, boolValueOf6);
        Boolean boolValueOf7 = Boolean.valueOf(enumC4105gz1 == enumC4105gz3);
        GP1 gp7 = c2455Xv2.g;
        gp7.getClass();
        gp7.m(null, boolValueOf7);
        Boolean boolValueOf8 = Boolean.valueOf(enumC4105gz1 == enumC4105gz3);
        GP1 gp8 = c2455Xv2.h;
        gp8.getClass();
        gp8.m(null, boolValueOf8);
        Boolean boolValueOf9 = Boolean.valueOf(enumC4105gz1 == enumC4105gz2);
        GP1 gp9 = c2455Xv2.l;
        gp9.getClass();
        gp9.m(null, boolValueOf9);
        Boolean boolValueOf10 = Boolean.valueOf(enumC4105gz1 != enumC4105gz2);
        GP1 gp10 = c2455Xv2.m;
        gp10.getClass();
        gp10.m(null, boolValueOf10);
        Boolean boolValueOf11 = Boolean.valueOf(enumC4105gz1 == enumC4105gz3);
        GP1 gp11 = c2455Xv2.n;
        gp11.getClass();
        gp11.m(null, boolValueOf11);
        Boolean boolValueOf12 = Boolean.valueOf(enumC4105gz1 == enumC4105gz3);
        GP1 gp12 = c2455Xv2.o;
        gp12.getClass();
        gp12.m(null, boolValueOf12);
        Boolean boolValueOf13 = Boolean.valueOf(enumC4105gz1 == enumC4105gz2);
        GP1 gp13 = c2455Xv2.p;
        gp13.getClass();
        gp13.m(null, boolValueOf13);
        Boolean boolValueOf14 = Boolean.valueOf(enumC4105gz1 != enumC4105gz2);
        GP1 gp14 = c2455Xv2.q;
        gp14.getClass();
        gp14.m(null, boolValueOf14);
        EnumC4105gz1 enumC4105gz4 = EnumC4105gz1.e;
        Boolean boolValueOf15 = Boolean.valueOf(enumC4105gz1 == enumC4105gz4);
        GP1 gp15 = c2455Xv2.r;
        gp15.getClass();
        gp15.m(null, boolValueOf15);
        Boolean boolValueOf16 = Boolean.valueOf(enumC4105gz1 == enumC4105gz4);
        GP1 gp16 = c2455Xv2.s;
        gp16.getClass();
        gp16.m(null, boolValueOf16);
        return Unit.a;
    }
}
