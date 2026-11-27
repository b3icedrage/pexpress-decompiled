package androidx.startup;

import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;
import androidx.annotation.NonNull;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import defpackage.C7454wh;
import defpackage.C7815yP1;
import io.sentry.android.core.performance.h;

/* JADX INFO: loaded from: classes.dex */
public class InitializationProvider extends ContentProvider {
    @Override // android.content.ContentProvider
    public final int delete(@NonNull Uri uri, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final String getType(@NonNull Uri uri) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final Uri insert(@NonNull Uri uri, ContentValues contentValues) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        h.e(this);
        Context context = getContext();
        if (context == null) {
            C7815yP1 c7815yP1 = new C7815yP1("Context cannot be null");
            h.f(this);
            throw c7815yP1;
        }
        if (context.getApplicationContext() != null) {
            C7454wh c7454whC = C7454wh.c(context);
            Context context2 = c7454whC.c;
            try {
                try {
                    Trace.beginSection("Startup");
                    c7454whC.a(context2.getPackageManager().getProviderInfo(new ComponentName(context2.getPackageName(), InitializationProvider.class.getName()), UserVerificationMethods.USER_VERIFY_PATTERN).metaData);
                    Trace.endSection();
                } catch (PackageManager.NameNotFoundException e) {
                    throw new C7815yP1(e);
                }
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        h.f(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(@NonNull Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        throw new IllegalStateException("Not allowed.");
    }

    @Override // android.content.ContentProvider
    public final int update(@NonNull Uri uri, ContentValues contentValues, String str, String[] strArr) {
        throw new IllegalStateException("Not allowed.");
    }
}
