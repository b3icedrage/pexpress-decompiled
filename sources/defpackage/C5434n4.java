package defpackage;

import com.api.core.backend.domain.models.responseModels.CommonAccount;
import com.api.core.backend.domain.models.responseModels.CommonAccounts;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: n4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C5434n4 extends AbstractC7066uq {

    @NotNull
    public final InterfaceC2865b4 e;

    @NotNull
    public final EE1 f;

    @NotNull
    public final C1699On1 g;

    /* JADX INFO: renamed from: n4$a */
    @InterfaceC3368dU(c = "com.base.feature.robot.accountselection.screens.AccountSelectionViewModelBase$accounts$1", f = "AccountSelectionViewModelBase.kt", l = {}, m = "invokeSuspend")
    public static final class a extends AW1 implements InterfaceC1138Hj0<CommonAccounts, EnumC4164hF1, Long, JM<? super List<? extends C5648o5>>, Object> {
        public /* synthetic */ CommonAccounts d;
        public /* synthetic */ EnumC4164hF1 e;
        public /* synthetic */ Long g;

        public a(JM<? super a> jm) {
            super(4, jm);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            CommonAccounts commonAccounts = this.d;
            EnumC4164hF1 enumC4164hF1 = this.e;
            Long l = this.g;
            C5434n4.this.getClass();
            List<CommonAccount> listA = commonAccounts.a();
            ArrayList arrayList = new ArrayList(XE.m(listA, 10));
            for (CommonAccount commonAccount : listA) {
                arrayList.add(new C5648o5(commonAccount, commonAccount.e(enumC4164hF1, l), commonAccount.getCurrency()));
            }
            return arrayList;
        }

        @Override // defpackage.InterfaceC1138Hj0
        public final Object l(CommonAccounts commonAccounts, EnumC4164hF1 enumC4164hF1, Long l, JM<? super List<? extends C5648o5>> jm) {
            a aVar = C5434n4.this.new a(jm);
            aVar.d = commonAccounts;
            aVar.e = enumC4164hF1;
            aVar.g = l;
            return aVar.invokeSuspend(Unit.a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5434n4(@NotNull C4923kf appData, @NotNull InterfaceC2865b4 accountSelectionCallbacks, @NotNull EE1 selectAccountUseCaseApi, @NotNull AbstractC2167Un1 realAccountIdUseCase, @NotNull O3 accountModeSelectionUseCase) {
        super(accountSelectionCallbacks);
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(accountSelectionCallbacks, "accountSelectionCallbacks");
        Intrinsics.checkNotNullParameter(selectAccountUseCaseApi, "selectAccountUseCaseApi");
        Intrinsics.checkNotNullParameter(realAccountIdUseCase, "realAccountIdUseCase");
        Intrinsics.checkNotNullParameter(accountModeSelectionUseCase, "accountModeSelectionUseCase");
        this.e = accountSelectionCallbacks;
        this.f = selectAccountUseCaseApi;
        this.g = k(C4466ii.k(new C4250hg0(appData.m, 0), accountModeSelectionUseCase.k(), realAccountIdUseCase.k(), new a(null)), C5653o60.d, new C7395wP1());
    }
}
