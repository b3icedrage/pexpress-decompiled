package defpackage;

import com.api.core.backend.domain.models.resultModels.CommonResult;
import com.api.core.backend.domain.models.resultModels.CommonResultKt;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: iT1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4416iT1 extends C7576xG {

    @NotNull
    public final C0854Ds1 d;

    @NotNull
    public final US1 e;

    @NotNull
    public final InterfaceC3786fT1 f;

    @NotNull
    public final VS1 g;

    @NotNull
    public final QT1 h;
    public final long i;

    @NotNull
    public final InterfaceC6396rf0<Float> j;

    @NotNull
    public final InterfaceC6396rf0<TS1> k;

    @NotNull
    public final FP1<Boolean> l;

    /* JADX INFO: renamed from: iT1$a */
    @InterfaceC3368dU(c = "com.base.feature.stub.screens.stubgame.StubGameViewModelBase$onInit$1", f = "StubGameViewModelBase.kt", l = {79}, m = "invokeSuspend")
    public static final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;

        /* JADX INFO: renamed from: iT1$a$a, reason: collision with other inner class name */
        public static final class C0376a<T> implements InterfaceC6606sf0 {
            public final /* synthetic */ C4416iT1 d;

            public C0376a(C4416iT1 c4416iT1) {
                this.d = c4416iT1;
            }

            @Override // defpackage.InterfaceC6606sf0
            public final Object a(Object obj, JM jm) {
                C4416iT1 c4416iT1 = this.d;
                c4416iT1.getClass();
                C5189lv.k(C8056za.j(c4416iT1), null, new C4674jT1(c4416iT1, (TT1) obj, null), 3);
                return Unit.a;
            }
        }

        public a(JM<? super a> jm) {
            super(2, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return C4416iT1.this.new a(jm);
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
            C4416iT1 c4416iT1 = C4416iT1.this;
            C6120qK1 c6120qK1F = c4416iT1.f.f();
            C0376a c0376a = new C0376a(c4416iT1);
            this.d = 1;
            c6120qK1F.c(c0376a, this);
            return mn;
        }
    }

    public C4416iT1(@NotNull C0854Ds1 requestFakeCandlesHistoryUseCase, @NotNull US1 stubCurrentChartPositionProvider, @NotNull InterfaceC3786fT1 stubGameInteractor, @NotNull VS1 stubGameCallbacks, @NotNull QT1 stubResultsProvider) {
        Intrinsics.checkNotNullParameter(requestFakeCandlesHistoryUseCase, "requestFakeCandlesHistoryUseCase");
        Intrinsics.checkNotNullParameter(stubCurrentChartPositionProvider, "stubCurrentChartPositionProvider");
        Intrinsics.checkNotNullParameter(stubGameInteractor, "stubGameInteractor");
        Intrinsics.checkNotNullParameter(stubGameCallbacks, "stubGameCallbacks");
        Intrinsics.checkNotNullParameter(stubResultsProvider, "stubResultsProvider");
        this.d = requestFakeCandlesHistoryUseCase;
        this.e = stubCurrentChartPositionProvider;
        this.f = stubGameInteractor;
        this.g = stubGameCallbacks;
        this.h = stubResultsProvider;
        InterfaceC3786fT1.a.getClass();
        this.i = InterfaceC3786fT1.a.b;
        this.j = stubGameInteractor.e();
        this.k = stubGameInteractor.d();
        this.l = stubGameInteractor.c();
    }

    @Override // defpackage.C7576xG
    public final void j() {
        C5189lv.k(C8056za.j(this), null, new a(null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Nullable
    public final Serializable l(@NotNull LM lm) {
        C5307mT1 c5307mT1;
        if (lm instanceof C5307mT1) {
            c5307mT1 = (C5307mT1) lm;
            int i = c5307mT1.g;
            if ((i & Integer.MIN_VALUE) != 0) {
                c5307mT1.g = i - Integer.MIN_VALUE;
            } else {
                c5307mT1 = new C5307mT1(this, lm);
            }
        } else {
            c5307mT1 = new C5307mT1(this, lm);
        }
        C5307mT1 c5307mT2 = c5307mT1;
        Object objB = c5307mT2.d;
        MN mn = MN.d;
        int i2 = c5307mT2.g;
        if (i2 == 0) {
            C1795Pt1.b(objB);
            c5307mT2.g = 1;
            objB = this.d.b("", 300L, 0L, c5307mT2);
            if (objB == mn) {
                return mn;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C1795Pt1.b(objB);
        }
        List list = (List) CommonResultKt.b((CommonResult) objB);
        ArrayList arrayList = null;
        if (list != null) {
            Intrinsics.checkNotNullParameter(list, "<this>");
            float size = list.size();
            ArrayList arrayList2 = new ArrayList(XE.m(list, 10));
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    WE.l();
                    throw null;
                }
                arrayList2.add(new C3506e70((i3 - size) * 1000, ((BF) obj).c));
                i3 = i4;
            }
            arrayList = arrayList2;
        }
        Intrinsics.checkNotNull(arrayList);
        return arrayList;
    }
}
