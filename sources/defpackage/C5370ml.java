package defpackage;

import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC3368dU(c = "com.base.core.backend.usecases.AuthRetryKt", f = "AuthRetry.kt", l = {CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE, UserVerificationMethods.USER_VERIFY_LOCATION, 33}, m = "retryTransientOnce")
public final class C5370ml<T> extends LM {
    public Object d;
    public String e;
    public Function1 g;
    public /* synthetic */ Object h;
    public int i;

    public C5370ml() {
        throw null;
    }

    @Override // defpackage.AbstractC7487wq
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.h = obj;
        this.i |= Integer.MIN_VALUE;
        return C5580nl.a(null, null, null, this);
    }
}
