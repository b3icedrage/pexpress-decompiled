package defpackage;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: xy1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7723xy1 extends C7576xG {

    @NotNull
    public final D6 d;

    @NotNull
    public final b e;

    /* JADX INFO: renamed from: xy1$a */
    public static final class a implements InterfaceC6396rf0<Boolean> {
        public final /* synthetic */ GP1 d;

        /* JADX INFO: renamed from: xy1$a$a, reason: collision with other inner class name */
        public static final class C0536a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;

            /* JADX INFO: renamed from: xy1$a$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_activation.screens.RobotRealAccountActivationViewModelBase$special$$inlined$map$1$2", f = "RobotRealAccountActivationViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0537a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0537a(JM jm) {
                    super(jm);
                }

                @Override // defpackage.AbstractC7487wq
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    this.d = obj;
                    this.e |= Integer.MIN_VALUE;
                    return C0536a.this.a(null, this);
                }
            }

            public C0536a(InterfaceC6606sf0 interfaceC6606sf0) {
                this.d = interfaceC6606sf0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0537a c0537a;
                if (jm instanceof C0537a) {
                    c0537a = (C0537a) jm;
                    int i = c0537a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0537a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0537a = new C0537a(jm);
                    }
                } else {
                    c0537a = new C0537a(jm);
                }
                Object obj2 = c0537a.d;
                MN mn = MN.d;
                int i2 = c0537a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    Boolean boolValueOf = Boolean.valueOf(((C6106qG) obj) != null);
                    c0537a.e = 1;
                    if (this.d.a(boolValueOf, c0537a) == mn) {
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

        public a(GP1 gp1) {
            this.d = gp1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super Boolean> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            this.d.c(new C0536a(interfaceC6606sf0), jm);
            return MN.d;
        }
    }

    /* JADX INFO: renamed from: xy1$b */
    public static final class b implements InterfaceC6396rf0<C6895u2> {
        public final /* synthetic */ a d;
        public final /* synthetic */ C7723xy1 e;

        /* JADX INFO: renamed from: xy1$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ InterfaceC6606sf0 d;
            public final /* synthetic */ C7723xy1 e;

            /* JADX INFO: renamed from: xy1$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.base.feature.robot.robot.account_activation.screens.RobotRealAccountActivationViewModelBase$special$$inlined$map$2$2", f = "RobotRealAccountActivationViewModelBase.kt", l = {219}, m = "emit")
            public static final class C0538a extends LM {
                public /* synthetic */ Object d;
                public int e;

                public C0538a(JM jm) {
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

            public a(InterfaceC6606sf0 interfaceC6606sf0, C7723xy1 c7723xy1) {
                this.d = interfaceC6606sf0;
                this.e = c7723xy1;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            @Nullable
            public final Object a(Object obj, @NotNull JM jm) {
                C0538a c0538a;
                if (jm instanceof C0538a) {
                    c0538a = (C0538a) jm;
                    int i = c0538a.e;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0538a.e = i - Integer.MIN_VALUE;
                    } else {
                        c0538a = new C0538a(jm);
                    }
                } else {
                    c0538a = new C0538a(jm);
                }
                Object obj2 = c0538a.d;
                MN mn = MN.d;
                int i2 = c0538a.e;
                if (i2 == 0) {
                    C1795Pt1.b(obj2);
                    boolean zBooleanValue = ((Boolean) obj).booleanValue();
                    C7723xy1 c7723xy1 = this.e;
                    C6895u2 c6895u2 = zBooleanValue ? c7723xy1.d.a : c7723xy1.d.b;
                    c0538a.e = 1;
                    if (this.d.a(c6895u2, c0538a) == mn) {
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

        public b(a aVar, C7723xy1 c7723xy1) {
            this.d = aVar;
            this.e = c7723xy1;
        }

        @Override // defpackage.InterfaceC6396rf0
        @Nullable
        public final Object c(@NotNull InterfaceC6606sf0<? super C6895u2> interfaceC6606sf0, @NotNull JM jm) throws Throwable {
            Object objC = this.d.c(new a(interfaceC6606sf0, this.e), jm);
            return objC == MN.d ? objC : Unit.a;
        }
    }

    public C7723xy1(@NotNull C4923kf appDataRepository, @NotNull D6 activationStepsProviderApi) {
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(activationStepsProviderApi, "activationStepsProviderApi");
        this.d = activationStepsProviderApi;
        this.e = new b(new a(appDataRepository.c), this);
    }
}
