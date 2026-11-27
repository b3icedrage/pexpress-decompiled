package defpackage;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: u31, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.services.NetworkManager$initNetworkFlowCollector$1", f = "NetworkManager.kt", l = {90}, m = "invokeSuspend")
public final class C6901u31 extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
    public int d;
    public final /* synthetic */ C3098cA e;
    public final /* synthetic */ C1699On1 g;
    public final /* synthetic */ C6062q31 h;
    public final /* synthetic */ InterfaceC8042zV0 i;

    /* JADX INFO: renamed from: u31$a */
    public static final class a<T> implements InterfaceC6606sf0 {
        public final /* synthetic */ C1699On1 d;
        public final /* synthetic */ C6062q31 e;
        public final /* synthetic */ InterfaceC8042zV0 g;

        /* JADX INFO: renamed from: u31$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0500a {
            public static final /* synthetic */ int[] a;

            static {
                int[] iArr = new int[EnumC3495e41.values().length];
                try {
                    EnumC3495e41 enumC3495e41 = EnumC3495e41.d;
                    iArr[0] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    EnumC3495e41 enumC3495e42 = EnumC3495e41.d;
                    iArr[3] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    EnumC3495e41 enumC3495e43 = EnumC3495e41.d;
                    iArr[4] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    EnumC3495e41 enumC3495e44 = EnumC3495e41.d;
                    iArr[7] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    EnumC3495e41 enumC3495e45 = EnumC3495e41.d;
                    iArr[8] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                a = iArr;
            }
        }

        /* JADX INFO: renamed from: u31$a$b */
        @InterfaceC3368dU(c = "com.base.app.services.NetworkManager$initNetworkFlowCollector$1$1", f = "NetworkManager.kt", l = {107}, m = "emit")
        public static final class b extends LM {
            public a d;
            public /* synthetic */ Object e;
            public final /* synthetic */ a<T> g;
            public int h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(a<? super T> aVar, JM<? super b> jm) {
                super(jm);
                this.g = aVar;
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                this.e = obj;
                this.h |= Integer.MIN_VALUE;
                return this.g.a(null, this);
            }
        }

        public a(C1699On1 c1699On1, C6062q31 c6062q31, InterfaceC8042zV0 interfaceC8042zV0) {
            this.d = c1699On1;
            this.e = c6062q31;
            this.g = interfaceC8042zV0;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // defpackage.InterfaceC6606sf0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object a(EnumC3495e41 enumC3495e41, JM<? super Unit> jm) {
            b bVar;
            int i;
            a<T> aVar;
            if (jm instanceof b) {
                bVar = (b) jm;
                int i2 = bVar.h;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    bVar.h = i2 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(this, jm);
                }
            } else {
                bVar = new b(this, jm);
            }
            Object obj = bVar.e;
            MN mn = MN.d;
            int i3 = bVar.h;
            if (i3 == 0) {
                C1795Pt1.b(obj);
                T value = this.d.d.getValue();
                Boolean bool = Boolean.FALSE;
                if (!Intrinsics.a(value, bool)) {
                    C6062q31 c6062q31 = this.e;
                    InterfaceC8042zV0 interfaceC8042zV0 = this.g;
                    if (enumC3495e41 == null) {
                        i = -1;
                    } else {
                        c6062q31.getClass();
                        i = C6062q31.a.a[enumC3495e41.ordinal()];
                    }
                    InterfaceC0859Du0 interfaceC0859Du0 = c6062q31.a;
                    switch (i) {
                        case -1:
                        case 7:
                            interfaceC0859Du0.m(interfaceC0859Du0.f());
                            break;
                        case 1:
                            C4412iS0 lockViewWithProgress = interfaceC8042zV0.c().g;
                            Intrinsics.checkNotNullExpressionValue(lockViewWithProgress, "lockViewWithProgress");
                            ConstraintLayout constraintLayout = lockViewWithProgress.d;
                            Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
                            if (constraintLayout.getVisibility() == 0) {
                                c6062q31.a.h();
                                C5189lv.k(interfaceC8042zV0.d(), null, new C31(c6062q31, interfaceC8042zV0, null), 3);
                            }
                            break;
                        case 2:
                            interfaceC0859Du0.h();
                            C5189lv.k(interfaceC8042zV0.d(), null, new C31(c6062q31, interfaceC8042zV0, null), 3);
                            break;
                        case 3:
                            interfaceC0859Du0.l();
                            break;
                        case 4:
                            interfaceC0859Du0.l();
                            break;
                        case 5:
                            interfaceC0859Du0.j();
                            break;
                        case 6:
                            interfaceC0859Du0.k();
                            break;
                    }
                } else {
                    InterfaceC0859Du0 interfaceC0859Du1 = this.e.a;
                    interfaceC0859Du1.m(interfaceC0859Du1.f());
                }
                int i4 = enumC3495e41 != null ? C0500a.a[enumC3495e41.ordinal()] : -1;
                if (i4 == 1) {
                    this.e.k = true;
                    GP1 gp1 = this.e.l;
                    gp1.getClass();
                    gp1.m(null, bool);
                    GP1 gp2 = this.e.m;
                    gp2.getClass();
                    gp2.m(null, bool);
                } else if (i4 == 2) {
                    C2936bP1 c2936bP1 = this.e.e.u.b;
                    if ((c2936bP1 == null || !c2936bP1.g()) && this.e.k) {
                        C6062q31 c6062q32 = this.e;
                        bVar.d = this;
                        bVar.h = 1;
                        if (C6062q31.c(c6062q32, bVar) == mn) {
                            return mn;
                        }
                    }
                    aVar = this;
                } else if (i4 == 3) {
                    GP1 gp3 = this.e.m;
                    Boolean bool2 = Boolean.TRUE;
                    gp3.getClass();
                    gp3.m(null, bool2);
                } else if (i4 == 4) {
                    this.e.k = true;
                } else if (i4 == 5) {
                    GP1 gp4 = this.e.l;
                    Boolean bool3 = Boolean.TRUE;
                    gp4.getClass();
                    gp4.m(null, bool3);
                }
                return Unit.a;
            }
            if (i3 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = bVar.d;
            C1795Pt1.b(obj);
            GP1 gp5 = aVar.e.l;
            Boolean bool4 = Boolean.FALSE;
            gp5.getClass();
            gp5.m(null, bool4);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6901u31(C3098cA c3098cA, C1699On1 c1699On1, C6062q31 c6062q31, InterfaceC8042zV0 interfaceC8042zV0, JM jm) {
        super(2, jm);
        this.e = c3098cA;
        this.g = c1699On1;
        this.h = c6062q31;
        this.i = interfaceC8042zV0;
    }

    @Override // defpackage.AbstractC7487wq
    public final JM<Unit> create(Object obj, JM<?> jm) {
        return new C6901u31(this.e, this.g, this.h, this.i, jm);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(KN kn, JM<? super Unit> jm) {
        return ((C6901u31) create(kn, jm)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.AbstractC7487wq
    public final Object invokeSuspend(Object obj) {
        MN mn = MN.d;
        int i = this.d;
        if (i == 0) {
            C1795Pt1.b(obj);
            a aVar = new a(this.g, this.h, this.i);
            this.d = 1;
            if (this.e.c(aVar, this) == mn) {
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
