package defpackage;

import com.appsflyer.share.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class J2 extends G2 {

    @NotNull
    public final C4923kf d;

    @NotNull
    public final M2 e;

    @NotNull
    public final VK1 f;

    @NotNull
    public final c g;

    @InterfaceC3368dU(c = "com.base.feature.account.screens.balance.AccountBalanceViewModelBase$onDepositClick$1", f = "AccountBalanceViewModelBase.kt", l = {RequestError.NO_DEV_KEY}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: J2$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.account.screens.balance.AccountBalanceViewModelBase$onDepositClick$1$1", f = "AccountBalanceViewModelBase.kt", l = {38}, m = "invokeSuspend")
        public static final class C0056a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ J2 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0056a(J2 j2, JM<? super C0056a> jm) {
                super(2, jm);
                this.e = j2;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new C0056a(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0056a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C6120qK1 c6120qK1 = this.e.d.t;
                    Unit unit = Unit.a;
                    this.d = 1;
                    if (c6120qK1.a(unit, this) == mn) {
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

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return J2.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                J2 j2 = J2.this;
                boolean zBooleanValue = ((Boolean) j2.d.e.getValue()).booleanValue();
                M2 m2 = j2.e;
                if (zBooleanValue) {
                    EnumC3495e41 enumC3495e41 = (EnumC3495e41) j2.d.r.getValue();
                    if (enumC3495e41 == null || !C7652xe.g(enumC3495e41)) {
                        this.d = 1;
                        if (m2.g(this) == mn) {
                            return mn;
                        }
                    } else {
                        C5189lv.k(C8056za.j(j2), null, new C0056a(j2, null), 3);
                    }
                } else {
                    m2.f();
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

    @InterfaceC3368dU(c = "com.base.feature.account.screens.balance.AccountBalanceViewModelBase$onWithdrawClick$1", f = "AccountBalanceViewModelBase.kt", l = {57, 60}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        @InterfaceC3368dU(c = "com.base.feature.account.screens.balance.AccountBalanceViewModelBase$onWithdrawClick$1$1", f = "AccountBalanceViewModelBase.kt", l = {54}, m = "invokeSuspend")
        public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public final /* synthetic */ J2 e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(J2 j2, JM<? super a> jm) {
                super(2, jm);
                this.e = j2;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                return new a(this.e, jm);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C6120qK1 c6120qK1 = this.e.d.t;
                    Unit unit = Unit.a;
                    this.d = 1;
                    if (c6120qK1.a(unit, this) == mn) {
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

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return J2.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x005b, code lost:
        
            if (r5.e.c(r10) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x008a, code lost:
        
            if (r5.f.a(r11, null, null) == r0) goto L23;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008c, code lost:
        
            return r0;
         */
        @Override // defpackage.AbstractC7487wq
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                MN r0 = defpackage.MN.d
                int r1 = r10.d
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1d
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                defpackage.C1795Pt1.b(r11)
                goto L8d
            L11:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L19:
                defpackage.C1795Pt1.b(r11)
                goto L5e
            L1d:
                defpackage.C1795Pt1.b(r11)
                J2 r5 = defpackage.J2.this
                kf r11 = r5.d
                GP1 r11 = r11.e
                java.lang.Object r11 = r11.getValue()
                java.lang.Boolean r11 = (java.lang.Boolean) r11
                boolean r11 = r11.booleanValue()
                r1 = 0
                if (r11 == 0) goto L61
                kf r11 = r5.d
                GP1 r11 = r11.r
                java.lang.Object r11 = r11.getValue()
                e41 r11 = (defpackage.EnumC3495e41) r11
                if (r11 == 0) goto L53
                boolean r11 = defpackage.C7652xe.g(r11)
                if (r11 != r3) goto L53
                KN r11 = defpackage.C8056za.j(r5)
                J2$b$a r0 = new J2$b$a
                r0.<init>(r5, r1)
                r2 = 3
                defpackage.C5189lv.k(r11, r1, r0, r2)
                goto L8d
            L53:
                r10.d = r3
                M2 r11 = r5.e
                java.lang.Object r11 = r11.c(r10)
                if (r11 != r0) goto L5e
                goto L8c
            L5e:
                kotlin.Unit r11 = kotlin.Unit.a
                goto L8d
            L61:
                Nf$C r11 = new Nf$C
                H2 r3 = new H2
                java.lang.Class<J2> r6 = defpackage.J2.class
                java.lang.String r7 = "onAlertDialogActivateClick"
                r4 = 0
                java.lang.String r8 = "onAlertDialogActivateClick()V"
                r9 = 0
                r3.<init>(r4, r5, r6, r7, r8, r9)
                java.lang.String r4 = "activeAction"
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r3, r4)
                Dg r4 = new Dg
                r6 = 0
                r4.<init>(r3, r6)
                v9 r3 = defpackage.C7343w9.a(r4)
                r11.<init>(r3)
                r10.d = r2
                VK1 r2 = r5.f
                java.lang.Boolean r11 = r2.a(r11, r1, r1)
                if (r11 != r0) goto L8d
            L8c:
                return r0
            L8d:
                kotlin.Unit r11 = kotlin.Unit.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: J2.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c implements InterfaceC6396rf0<C2591Zp> {
        public final /* synthetic */ GP1 d;
        public final /* synthetic */ J2 e;

        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ J2 e;

            /* JADX INFO: renamed from: J2$c$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.account.screens.balance.AccountBalanceViewModelBase$special$$inlined$map$1$2", f = "AccountBalanceViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0057a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0057a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return a.this.a(null, this);
                }
            }

            public a(InterfaceC6606sf0 interfaceC6606sf0, J2 j2) {
                this.d = interfaceC6606sf0;
                this.e = j2;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0057a c0057a;
                if (jm instanceof C0057a) {
                    c0057a = (C0057a) jm;
                    int i = c0057a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0057a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0057a = new C0057a(jm);
                    }
                } else {
                    c0057a = new C0057a(jm);
                }
                Object obj2 = c0057a.d;
                MN mn = MN.d;
                int i2 = c0057a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    C6945uG c6945uG = (C6945uG) obj;
                    C2591Zp c2591Zp = c6945uG != null ? new C2591Zp(c6945uG.j, (String) this.e.d.F.d.getValue()) : null;
                    c0057a.e = 1;
                    if (this.d.a(c2591Zp, c0057a) == mn) {
                        return mn;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj2);
                }
                return Unit.a;
            }
        }

        public c(GP1 gp1, J2 j2) {
            this.d = gp1;
            this.e = j2;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super C2591Zp> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new a(interfaceC6606sf0, this.e), jm);
            return MN.d;
        }
    }

    public J2(@NotNull C4923kf appDataRepository, @NotNull M2 accountCallbacks, @NotNull VK1 showAlertDialogUseCase) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(accountCallbacks, "accountCallbacks");
        Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
        this.d = appDataRepository;
        this.e = accountCallbacks;
        this.f = showAlertDialogUseCase;
        this.g = new c(appDataRepository.k, this);
    }

    @Override // defpackage.G2
    @NotNull
    public final c l() {
        return this.g;
    }

    @Override // defpackage.G2
    public final void m() {
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
    }

    @Override // defpackage.G2
    public final void n() {
        C5189lv.k(C8056za.j(this), null, new b(null), 3);
    }
}
