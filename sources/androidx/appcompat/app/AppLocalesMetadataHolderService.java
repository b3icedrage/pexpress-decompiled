package androidx.appcompat.app;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;

/* JADX INFO: loaded from: classes.dex */
public final class AppLocalesMetadataHolderService extends Service {
    public static final /* synthetic */ int d = 0;

    public static class a {
        public static int a() {
            return UserVerificationMethods.USER_VERIFY_NONE;
        }
    }

    @Override // android.app.Service
    @NonNull
    public final IBinder onBind(@NonNull Intent intent) {
        throw new UnsupportedOperationException();
    }
}
