package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.appsflyer.sdk_base.referrer.Payload;
import kotlin.Unit;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: oK, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5698oK {

    @NotNull
    public final ConnectivityManager a;

    @NotNull
    public final InterfaceC6396rf0<AbstractC4387iK> b;

    @Nullable
    public AbstractC4387iK c;

    @NotNull
    public final C6120qK1 d;

    @NotNull
    public final GP1 e;

    @NotNull
    public final GP1 f;

    @NotNull
    public final GP1 g;

    /* JADX INFO: renamed from: oK$a */
    @InterfaceC3368dU(c = "com.api.utils.ConnectionStatusProvider$1", f = "ConnectionStatusProvider.kt", l = {100}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<InterfaceC1133Hh1<? super AbstractC4387iK>, JM<? super Unit>, Object> {
        public int d;
        public /* synthetic */ Object e;

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            a aVar = C5698oK.this.new a(jm);
            aVar.e = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC1133Hh1<? super AbstractC4387iK> interfaceC1133Hh1, JM<? super Unit> jm) {
            return ((a) create(interfaceC1133Hh1, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                InterfaceC1133Hh1 interfaceC1133Hh1 = (InterfaceC1133Hh1) this.e;
                Q2 q2 = new Q2(interfaceC1133Hh1, 3);
                C6399rg c6399rg = new C6399rg(interfaceC1133Hh1, 4);
                C1907Rf c1907Rf = new C1907Rf(interfaceC1133Hh1, 3);
                C5698oK c5698oK = C5698oK.this;
                c5698oK.getClass();
                C5908pK c5908pK = new C5908pK(q2, c5698oK, c6399rg, c1907Rf);
                c5698oK.a.registerDefaultNetworkCallback(c5908pK);
                C5488nK c5488nK = new C5488nK(0, c5698oK, c5908pK);
                this.d = 1;
                if (C0977Fh1.a(interfaceC1133Hh1, c5488nK, this) == mn) {
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

    /* JADX INFO: renamed from: oK$b */
    @InterfaceC3368dU(c = "com.api.utils.ConnectionStatusProvider$2", f = "ConnectionStatusProvider.kt", l = {105}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: oK$b$a */
        public static final class a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C5698oK d;

            /* JADX INFO: renamed from: oK$b$a$a, reason: collision with other inner class name */
            @InterfaceC3368dU(c = "com.api.utils.ConnectionStatusProvider$2$1", f = "ConnectionStatusProvider.kt", l = {107}, m = "emit")
            public static final class C0454a extends LM {
                public a d;
                public AbstractC4387iK e;
                public /* synthetic */ Object g;
                public final /* synthetic */ a<T> h;
                public int i;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C0454a(a<? super T> aVar, JM<? super C0454a> jm) {
                    super(jm);
                    this.h = aVar;
                }

                @Override // defpackage.AbstractC7487wq
                public final Object invokeSuspend(Object obj) {
                    this.g = obj;
                    this.i |= Integer.MIN_VALUE;
                    return this.h.a(null, this);
                }
            }

            public a(C5698oK c5698oK) {
                this.d = c5698oK;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // defpackage.InterfaceC6606sf0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object a(AbstractC4387iK abstractC4387iK, JM<? super Unit> jm) {
                C0454a c0454a;
                a<T> aVar;
                if (jm instanceof C0454a) {
                    c0454a = (C0454a) jm;
                    int i = c0454a.i;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        c0454a.i = i - Integer.MIN_VALUE;
                    } else {
                        c0454a = new C0454a(this, jm);
                    }
                } else {
                    c0454a = new C0454a(this, jm);
                }
                Object obj = c0454a.g;
                MN mn = MN.d;
                int i2 = c0454a.i;
                if (i2 == 0) {
                    C1795Pt1.b(obj);
                    C5698oK c5698oK = this.d;
                    if (Intrinsics.a(c5698oK.c, AbstractC4387iK.b.a) && Intrinsics.a(abstractC4387iK, AbstractC4387iK.a.a)) {
                        C6120qK1 c6120qK1 = c5698oK.d;
                        Unit unit = Unit.a;
                        c0454a.d = this;
                        c0454a.e = abstractC4387iK;
                        c0454a.i = 1;
                        if (c6120qK1.a(unit, c0454a) == mn) {
                            return mn;
                        }
                    }
                    aVar = this;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    abstractC4387iK = c0454a.e;
                    aVar = c0454a.d;
                    C1795Pt1.b(obj);
                }
                aVar.d.c = abstractC4387iK;
                return Unit.a;
            }
        }

        public b(JM<? super b> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C5698oK.this.new b(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C5698oK c5698oK = C5698oK.this;
                InterfaceC6396rf0<AbstractC4387iK> interfaceC6396rf0 = c5698oK.b;
                a aVar = new a(c5698oK);
                this.d = 1;
                if (interfaceC6396rf0.c(aVar, this) == mn) {
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

    public C5698oK(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Object systemService = C6333rM.getSystemService(context, ConnectivityManager.class);
        if (systemService == null) {
            throw new IllegalStateException("The class is not a supported system service.");
        }
        this.a = (ConnectivityManager) systemService;
        C6120qK1 c6120qK1G = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        this.d = c6120qK1G;
        C4466ii.e(c6120qK1G);
        Boolean bool = Boolean.FALSE;
        this.e = C1589Ne.i(bool);
        this.f = C1589Ne.i(bool);
        this.g = C1589Ne.i(bool);
        if (Build.VERSION.SDK_INT < 26) {
            this.b = C5020l60.d;
        } else {
            this.b = new C1883Qx(new a(null), e.d, -2, EnumC1796Pu.d);
            C5189lv.k(C6215qm0.d, null, new b(null), 3);
        }
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT >= 26) {
            return ((Boolean) this.e.getValue()).booleanValue();
        }
        ConnectivityManager connectivityManager = this.a;
        NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
        if (Payload.SOURCE_SAMSUNG.equalsIgnoreCase(Build.MANUFACTURER)) {
            return (networkCapabilities != null && networkCapabilities.hasCapability(12)) || (networkCapabilities != null && networkCapabilities.hasTransport(4));
        }
        if (networkCapabilities != null) {
            return networkCapabilities.hasCapability(12);
        }
        return false;
    }
}
