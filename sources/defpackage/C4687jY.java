package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: jY, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.updaters.DepositValuesUpdater$start$2", f = "DepositValuesUpdater.kt", l = {37}, m = "invokeSuspend")
public final class C4687jY extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C5530nY e;

    /* JADX INFO: renamed from: jY$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C5530nY d;

        /* JADX INFO: renamed from: jY$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.core.backend.updaters.DepositValuesUpdater$start$2$3", f = "DepositValuesUpdater.kt", l = {38, 39}, m = "emit")
        public static final class C0418a extends LM {
            public a d;
            public C6945uG e;
            public boolean g;
            public /* synthetic */ Object h;
            public final /* synthetic */ a<T> i;
            public int j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C0418a(a<? super T> aVar, JM<? super C0418a> jm) {
                super(jm);
                this.i = aVar;
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                this.h = obj;
                this.j |= Integer.MIN_VALUE;
                return this.i.a(null, this);
            }
        }

        public a(C5530nY c5530nY) {
            this.d = c5530nY;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object a(C6945uG c6945uG, JM<? super Unit> jm) {
            C0418a c0418a;
            a<T> aVar;
            C6945uG c6945uG2;
            boolean z;
            a<T> aVar2;
            if (jm instanceof C0418a) {
                c0418a = (C0418a) jm;
                int i = c0418a.j;
                if ((i & Integer.MIN_VALUE) != 0) {
                    c0418a.j = i - Integer.MIN_VALUE;
                } else {
                    c0418a = new C0418a(this, jm);
                }
            } else {
                c0418a = new C0418a(this, jm);
            }
            Object objD = c0418a.h;
            MN mn = MN.d;
            int i2 = c0418a.j;
            if (i2 == 0) {
                C1795Pt1.b(objD);
                C5530nY c5530nY = this.d;
                c0418a.d = this;
                c0418a.e = c6945uG;
                c0418a.j = 1;
                c5530nY.getClass();
                objD = LN.d(new C5320mY(c5530nY, null), c0418a);
                if (objD != mn) {
                    aVar = this;
                }
                return mn;
            }
            if (i2 == 1) {
                c6945uG = c0418a.e;
                aVar = c0418a.d;
                C1795Pt1.b(objD);
            } else {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                z = c0418a.g;
                c6945uG2 = c0418a.e;
                aVar2 = c0418a.d;
                C1795Pt1.b(objD);
            }
            boolean zBooleanValue = ((Boolean) objD).booleanValue();
            if (z && zBooleanValue) {
                aVar2.d.e = new Long(c6945uG2.a);
            }
            return Unit.a;
            boolean zBooleanValue2 = ((Boolean) objD).booleanValue();
            C5530nY c5530nY2 = aVar.d;
            long j = c6945uG.a;
            c0418a.d = aVar;
            c0418a.e = c6945uG;
            c0418a.g = zBooleanValue2;
            c0418a.j = 2;
            c5530nY2.getClass();
            Object objD2 = LN.d(new C5107lY(c5530nY2, j, null), c0418a);
            if (objD2 != mn) {
                c6945uG2 = c6945uG;
                z = zBooleanValue2;
                objD = objD2;
                aVar2 = aVar;
                boolean zBooleanValue3 = ((Boolean) objD).booleanValue();
                if (z) {
                    aVar2.d.e = new Long(c6945uG2.a);
                }
                return Unit.a;
            }
            return mn;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4687jY(C5530nY c5530nY, JM<? super C4687jY> jm) {
        super(2, jm);
        this.e = c5530nY;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C4687jY(this.e, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C4687jY) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            C5530nY c5530nY = this.e;
            F20 f20 = new F20(new C4250hg0(c5530nY.a.k, 0), new C4429iY(0), C0970Ff0.b);
            a aVar = new a(c5530nY);
            this.d = 1;
            Object objC = f20.c(new C4897kY(aVar, c5530nY), this);
            if (objC != mn) {
                objC = Unit.a;
            }
            if (objC == mn) {
                return mn;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(obj);
        }
        return Unit.a;
    }
}
