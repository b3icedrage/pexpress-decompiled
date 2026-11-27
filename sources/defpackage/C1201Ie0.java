package defpackage;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ie0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.app.navigation.screen_starters.FirstScreenStarterImpl", f = "FirstScreenStarterImpl.kt", l = {UserVerificationMethods.USER_VERIFY_LOCATION, 34}, m = "openFirstFragment$suspendImpl")
public final class C1201Ie0 extends LM {
    public Function0 d;
    public /* synthetic */ Object e;
    public final /* synthetic */ C1045Ge0 g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1201Ie0(C1045Ge0 c1045Ge0, LM lm) {
        super(lm);
        this.g = c1045Ge0;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.e = obj;
        this.h |= Integer.MIN_VALUE;
        return C1045Ge0.d(this.g, null, null, this);
    }
}
