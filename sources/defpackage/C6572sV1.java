package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import com.appsflyer.share.attribution.RequestError;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: sV1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6572sV1 extends C7576xG {

    @NotNull
    public final InterfaceC4890kV1 d;

    @NotNull
    public final ReporterApi e;

    @NotNull
    public final C4422iV1 f;

    @NotNull
    public final C1699On1 g;

    @NotNull
    public final C1699On1 h;

    @NotNull
    public final GP1 i;

    @NotNull
    public final C6120qK1 j;

    /* JADX INFO: renamed from: sV1$a */
    @InterfaceC3368dU(c = "com.base.feature.support.support.screens.faq.SupportFaqViewModelBase$1", f = "SupportFaqViewModelBase.kt", l = {RequestError.NETWORK_FAILURE}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: sV1$a$a, reason: collision with other inner class name */
        public static final class C0486a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C6572sV1 d;

            public C0486a(C6572sV1 c6572sV1) {
                this.d = c6572sV1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C6572sV1 c6572sV1 = this.d;
                c6572sV1.f.a((EV1) obj);
                c6572sV1.d.d();
                return Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C6572sV1.this.new a(jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) throws Throwable {
            ((a) create(kn, jm)).invokeSuspend(Unit.a);
            return MN.d;
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) throws Throwable {
            MN mn = MN.d;
            int i = this.d;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                throw EK.c(obj);
            }
            C1795Pt1.b(obj);
            C6572sV1 c6572sV1 = C6572sV1.this;
            C6120qK1 c6120qK1 = c6572sV1.j;
            C0486a c0486a = new C0486a(c6572sV1);
            this.d = 1;
            c6120qK1.getClass();
            C6120qK1.o(c6120qK1, c0486a, this);
            return mn;
        }
    }

    public C6572sV1(@NotNull InterfaceC4890kV1 supportCallbacks, @NotNull C4923kf appData, @NotNull InterfaceC1192Ib0 faqItemsProvider, @NotNull ReporterApi reporter, @NotNull C4422iV1 supportBottomSheetDataProvider) {
        Intrinsics.checkNotNullParameter(supportCallbacks, "supportCallbacks");
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(faqItemsProvider, "faqItemsProvider");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(supportBottomSheetDataProvider, "supportBottomSheetDataProvider");
        this.d = supportCallbacks;
        this.e = reporter;
        this.f = supportBottomSheetDataProvider;
        C1699On1 c1699On1K = k(faqItemsProvider.a(), C5653o60.d, new C7395wP1());
        this.g = c1699On1K;
        this.h = c1699On1K;
        this.i = appData.e;
        this.j = C1589Ne.g((6 & 1) != 0 ? 0 : 1, 0, EnumC1796Pu.d);
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
    }
}
