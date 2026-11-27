package defpackage;

import com.google.android.gms.common.ConnectionResult;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.b;
import kotlin.time.c;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C3839fi1 extends C3629ei1 {

    @NotNull
    public final C4923kf b;

    @NotNull
    public final C1021Fw0 c;

    /* JADX INFO: renamed from: fi1$a */
    @InterfaceC3368dU(c = "com.impl.feature.profileandsettings.helpers.ProfileImagePreloaderImpl$images$1$1", f = "ProfileImagePreloaderImpl.kt", l = {ConnectionResult.API_DISABLED}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ CQ0 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CQ0 cq0, JM jm) {
            super(2, jm);
            this.g = cq0;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C3839fi1.this.new a(this.g, jm);
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
                GP1 gp1 = C3839fi1.this.b.l;
                b.a aVar = b.e;
                long jG = c.g(5, R40.SECONDS);
                this.d = 1;
                obj = C7236vf0.b(gp1, jG, new C2483Yf(2), this);
                if (obj == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            String str = (String) obj;
            if (str != null) {
                this.g.add(str);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3839fi1(@NotNull C4923kf appData, @NotNull InterfaceC3431dl0 getCurrentAvatarUrlUseCaseApi) {
        super(getCurrentAvatarUrlUseCaseApi);
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(getCurrentAvatarUrlUseCaseApi, "getCurrentAvatarUrlUseCaseApi");
        this.b = appData;
        CQ0 cq0B = VE.b();
        C5189lv.k(C3286d41.a, C6266r20.c, new a(cq0B, null), 2);
        this.c = new C1021Fw0(VE.a(cq0B), null, 2);
    }

    @Override // defpackage.InterfaceC7295vw0
    @NotNull
    public final C1021Fw0 f() {
        return this.c;
    }
}
