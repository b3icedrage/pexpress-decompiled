package defpackage;

import com.jivosite.sdk.network.retrofit.error.ErrorResponse;
import com.onesignal.core.activities.PermissionsActivity;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C4915kd implements C4705jd.a {

    @NotNull
    public final C3903g11 a;

    public C4915kd(@NotNull C3903g11 moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.a = moshi;
    }

    @Override // defpackage.C4705jd.a
    @NotNull
    public final <T> C4705jd<T> a(@NotNull C0935Et1<T> response) throws IOException {
        Intrinsics.checkNotNullParameter(response, "response");
        boolean zG = response.a.g();
        C0857Dt1 c0857Dt1 = response.a;
        int i = c0857Dt1.h;
        if (zG) {
            return new C4705jd<>(i, response.b, c0857Dt1.j.e(), null);
        }
        C1169Ht1 c1169Ht1 = response.c;
        Intrinsics.checkNotNull(c1169Ht1);
        ErrorResponse errorResponse = (ErrorResponse) this.a.a(ErrorResponse.class).b(c1169Ht1.l());
        Intrinsics.checkNotNull(errorResponse);
        C6313rF0 throwable = new C6313rF0(errorResponse.b);
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new C4705jd<>(i, null, null, throwable);
    }

    @Override // defpackage.C4705jd.a
    @NotNull
    public final <T> C4705jd<T> b(@NotNull Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        return new C4705jd<>(PermissionsActivity.DELAY_TIME_CALLBACK_CALL, null, null, throwable);
    }
}
