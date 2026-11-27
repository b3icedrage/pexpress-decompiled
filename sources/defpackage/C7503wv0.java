package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import androidx.annotation.NonNull;
import io.sentry.android.core.b0;
import java.util.Locale;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: wv0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7503wv0 {
    public static final Pattern g = Pattern.compile("[^\\p{Alnum}]");
    public static final String h = Pattern.quote("/");
    public final YK0 a;
    public final Context b;
    public final String c;
    public final InterfaceC2400Xd0 d;
    public final C6142qS e;
    public String f;

    public C7503wv0(Context context, String str, InterfaceC2400Xd0 interfaceC2400Xd0, C6142qS c6142qS) {
        if (context == null) {
            throw new IllegalArgumentException("appContext must not be null");
        }
        if (str == null) {
            throw new IllegalArgumentException("appIdentifier must not be null");
        }
        this.b = context;
        this.c = str;
        this.d = interfaceC2400Xd0;
        this.e = c6142qS;
        this.a = new YK0();
    }

    public static String b() {
        return "SYN_" + UUID.randomUUID().toString();
    }

    @NonNull
    public final synchronized String a(String str, SharedPreferences sharedPreferences) {
        String lowerCase;
        String string = UUID.randomUUID().toString();
        lowerCase = string == null ? null : g.matcher(string).replaceAll("").toLowerCase(Locale.US);
        Log.isLoggable("FirebaseCrashlytics", 2);
        sharedPreferences.edit().putString("crashlytics.installation.id", lowerCase).putString("firebase.installation.id", str).apply();
        return lowerCase;
    }

    @NonNull
    public final synchronized String c() {
        String strB;
        try {
            String str = this.f;
            if (str != null) {
                return str;
            }
            Log.isLoggable("FirebaseCrashlytics", 2);
            SharedPreferences sharedPreferences = this.b.getSharedPreferences("com.google.firebase.crashlytics", 0);
            String string = sharedPreferences.getString("firebase.installation.id", null);
            Log.isLoggable("FirebaseCrashlytics", 2);
            if (this.e.a()) {
                try {
                    strB = (String) Ac2.a(this.d.getId());
                } catch (Exception e) {
                    b0.f("FirebaseCrashlytics", "Failed to retrieve Firebase Installations ID.", e);
                    strB = null;
                }
                Log.isLoggable("FirebaseCrashlytics", 2);
                if (strB == null) {
                    strB = string == null ? b() : string;
                }
                if (strB.equals(string)) {
                    this.f = sharedPreferences.getString("crashlytics.installation.id", null);
                } else {
                    this.f = a(strB, sharedPreferences);
                }
            } else if (string == null || !string.startsWith("SYN_")) {
                this.f = a(b(), sharedPreferences);
            } else {
                this.f = sharedPreferences.getString("crashlytics.installation.id", null);
            }
            if (this.f == null) {
                b0.f("FirebaseCrashlytics", "Unable to determine Crashlytics Install Id, creating a new one.", null);
                this.f = a(b(), sharedPreferences);
            }
            Log.isLoggable("FirebaseCrashlytics", 2);
            return this.f;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final String d() {
        String str;
        YK0 yk0 = this.a;
        Context context = this.b;
        synchronized (yk0) {
            try {
                if (((String) yk0.d) == null) {
                    String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                    if (installerPackageName == null) {
                        installerPackageName = "";
                    }
                    yk0.d = installerPackageName;
                }
                str = "".equals((String) yk0.d) ? null : (String) yk0.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
