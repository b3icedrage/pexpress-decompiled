package defpackage;

import com.google.android.gms.auth.api.credentials.CredentialsApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Jm1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1304Jm1 extends ML0 implements Function1<C1774Pm1, C1774Pm1> {
    public static final C1304Jm1 d = new C1304Jm1(1);

    @Override // kotlin.jvm.functions.Function1
    public final C1774Pm1 invoke(C1774Pm1 c1774Pm1) {
        C1774Pm1 state = c1774Pm1;
        Intrinsics.checkNotNullParameter(state, "state");
        return C1774Pm1.a(state, null, AbstractC8106zm1.c.a, System.currentTimeMillis() / ((long) CredentialsApi.ACTIVITY_RESULT_ADD_ACCOUNT), 1);
    }
}
