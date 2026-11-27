package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Fi1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0980Fi1 extends AbstractC8090zi1 {

    @NotNull
    public final C5888pD0 y;

    @NotNull
    public final KW1 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0980Fi1(@NotNull C4923kf appDataRepository, @NotNull InterfaceC1211Ih1 profileCallbacks, @NotNull InterfaceC7776yC1 saveNicknameUseCase, @NotNull InterfaceC6638sn0 handleNicknameChangeUseCase, @NotNull InterfaceC4182hL1 showErrorUseCase, @NotNull ReporterApi reporter, @NotNull InterfaceC5862p6 activationStateProviderApi, @NotNull C5888pD0 isVerificationDisabledLocalExperiment) {
        super(appDataRepository, profileCallbacks, saveNicknameUseCase, handleNicknameChangeUseCase, showErrorUseCase, reporter, activationStateProviderApi);
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(profileCallbacks, "profileCallbacks");
        Intrinsics.checkNotNullParameter(saveNicknameUseCase, "saveNicknameUseCase");
        Intrinsics.checkNotNullParameter(handleNicknameChangeUseCase, "handleNicknameChangeUseCase");
        Intrinsics.checkNotNullParameter(showErrorUseCase, "showErrorUseCase");
        Intrinsics.checkNotNullParameter(reporter, "reporter");
        Intrinsics.checkNotNullParameter(activationStateProviderApi, "activationStateProviderApi");
        Intrinsics.checkNotNullParameter(isVerificationDisabledLocalExperiment, "isVerificationDisabledLocalExperiment");
        this.y = isVerificationDisabledLocalExperiment;
        this.z = XO0.b(new C4927kg(this, 3));
    }

    @Override // defpackage.AbstractC8090zi1
    @NotNull
    public final InterfaceC6396rf0<Boolean> l() {
        return (InterfaceC6396rf0) this.z.getValue();
    }
}
