package defpackage;

import com.base.feature.account.screens.settings.AccountSettingsPartBase;
import com.impl.feature.platform.screens.withdraw.WithdrawFragmentImpl;
import com.impl.feature.registration.screens.authorization.AuthorizationFragmentImpl;
import com.impl.feature.webpageinapp.screens.termsandconditions.BotTermsAndConditionsFragmentImpl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: v4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7113v4 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7113v4(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (AccountSettingsPartBase) this.e;
            case 1:
                return (AuthorizationFragmentImpl) this.e;
            case 2:
                return (BotTermsAndConditionsFragmentImpl) this.e;
            case 3:
                return (Wd2) ((JX) this.e).invoke();
            case 4:
                return (Wd2) ((JX) this.e).invoke();
            case 5:
                return (C1351Kc0) this.e;
            default:
                return (WithdrawFragmentImpl) this.e;
        }
    }
}
