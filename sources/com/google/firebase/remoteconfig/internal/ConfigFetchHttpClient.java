package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import androidx.annotation.Keep;
import com.google.android.gms.common.util.AndroidUtilsLight;
import com.google.android.gms.common.util.Hex;
import defpackage.C3182cb1;
import defpackage.C5272mI;
import defpackage.C7232ve0;
import defpackage.C7443we0;
import defpackage.C7863ye0;
import io.sentry.android.core.b0;
import j$.util.DesugarTimeZone;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class ConfigFetchHttpClient {
    public static final Pattern h = Pattern.compile("^[^:]+:([0-9]+):(android|ios|web):([0-9a-f]+)");
    public final Context a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final long f;
    public final long g;

    public ConfigFetchHttpClient(Context context, String str, String str2, String str3, long j, long j2) {
        this.a = context;
        this.b = str;
        this.c = str2;
        Matcher matcher = h.matcher(str);
        this.d = matcher.matches() ? matcher.group(1) : null;
        this.e = str3;
        this.f = j;
        this.g = j2;
    }

    public static JSONObject c(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "utf-8"));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int i = bufferedReader.read();
            if (i == -1) {
                return new JSONObject(sb.toString());
            }
            sb.append((char) i);
        }
    }

    public static void d(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        httpURLConnection.setFixedLengthStreamingMode(bArr.length);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(httpURLConnection.getOutputStream());
        bufferedOutputStream.write(bArr);
        bufferedOutputStream.flush();
        bufferedOutputStream.close();
    }

    public final JSONObject a(String str, String str2, Map<String, String> map, Long l) throws C7232ve0 {
        HashMap map2 = new HashMap();
        if (str == null) {
            throw new C7232ve0("Fetch failed: Firebase installation id is null.");
        }
        map2.put("appInstanceId", str);
        map2.put("appInstanceIdToken", str2);
        map2.put("appId", this.b);
        Context context = this.a;
        Locale locale = context.getResources().getConfiguration().locale;
        map2.put("countryCode", locale.getCountry());
        int i = Build.VERSION.SDK_INT;
        map2.put("languageCode", locale.toLanguageTag());
        map2.put("platformVersion", Integer.toString(i));
        map2.put("timeZone", TimeZone.getDefault().getID());
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo != null) {
                map2.put("appVersion", packageInfo.versionName);
                map2.put("appBuild", Long.toString(i >= 28 ? C3182cb1.b(packageInfo) : packageInfo.versionCode));
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        map2.put("packageName", context.getPackageName());
        map2.put("sdkVersion", "21.2.1");
        map2.put("analyticsUserProperties", new JSONObject(map));
        if (l != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSS'Z'", Locale.US);
            simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
            map2.put("firstOpenTime", simpleDateFormat.format(l));
        }
        return new JSONObject(map2);
    }

    public final HttpURLConnection b() {
        try {
            return (HttpURLConnection) new URL("https://firebaseremoteconfig.googleapis.com/v1/projects/" + this.d + "/namespaces/" + this.e + ":fetch").openConnection();
        } catch (IOException e) {
            throw new C7443we0(e.getMessage());
        }
    }

    @Keep
    public a.C0317a fetch(HttpURLConnection httpURLConnection, String str, String str2, Map<String, String> map, String str3, Map<String, String> map2, Long l, Date date) {
        String strBytesToStringUppercase;
        boolean z;
        JSONObject jSONObject;
        JSONArray jSONArray;
        httpURLConnection.setDoOutput(true);
        TimeUnit timeUnit = TimeUnit.SECONDS;
        httpURLConnection.setConnectTimeout((int) timeUnit.toMillis(this.f));
        httpURLConnection.setReadTimeout((int) timeUnit.toMillis(this.g));
        httpURLConnection.setRequestProperty("If-None-Match", str3);
        httpURLConnection.setRequestProperty("X-Goog-Api-Key", this.c);
        Context context = this.a;
        httpURLConnection.setRequestProperty("X-Android-Package", context.getPackageName());
        JSONObject jSONObject2 = null;
        try {
            byte[] packageCertificateHashBytes = AndroidUtilsLight.getPackageCertificateHashBytes(context, context.getPackageName());
            if (packageCertificateHashBytes == null) {
                b0.c("FirebaseRemoteConfig", "Could not get fingerprint hash for package: " + context.getPackageName());
                strBytesToStringUppercase = null;
            } else {
                strBytesToStringUppercase = Hex.bytesToStringUppercase(packageCertificateHashBytes, false);
            }
        } catch (PackageManager.NameNotFoundException e) {
            b0.d("FirebaseRemoteConfig", "No such package: " + context.getPackageName(), e);
        }
        httpURLConnection.setRequestProperty("X-Android-Cert", strBytesToStringUppercase);
        httpURLConnection.setRequestProperty("X-Google-GFE-Can-Retry", "yes");
        httpURLConnection.setRequestProperty("X-Goog-Firebase-Installations-Auth", str2);
        httpURLConnection.setRequestProperty("Content-Type", "application/json");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        for (Map.Entry<String, String> entry : map2.entrySet()) {
            try {
                httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            } catch (Throwable th) {
                httpURLConnection.disconnect();
                try {
                    httpURLConnection.getInputStream().close();
                } catch (IOException unused) {
                }
                throw th;
            }
        }
        try {
            d(httpURLConnection, a(str, str2, map, l).toString().getBytes("utf-8"));
            httpURLConnection.connect();
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode != 200) {
                throw new C7863ye0(responseCode, httpURLConnection.getResponseMessage());
            }
            String headerField = httpURLConnection.getHeaderField("ETag");
            JSONObject jSONObjectC = c(httpURLConnection);
            httpURLConnection.disconnect();
            try {
                httpURLConnection.getInputStream().close();
            } catch (IOException unused2) {
            }
            try {
                z = !jSONObjectC.get("state").equals("NO_CHANGE");
            } catch (JSONException unused3) {
                z = true;
            }
            if (!z) {
                return new a.C0317a(1, null, null);
            }
            try {
                int i = C5272mI.f;
                JSONObject jSONObject3 = new JSONObject();
                JSONArray jSONArray2 = new JSONArray();
                JSONObject jSONObject4 = new JSONObject();
                try {
                    jSONObject = jSONObjectC.getJSONObject("entries");
                } catch (JSONException unused4) {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    try {
                        jSONObject3 = new JSONObject(jSONObject.toString());
                    } catch (JSONException unused5) {
                    }
                }
                try {
                    jSONArray = jSONObjectC.getJSONArray("experimentDescriptions");
                } catch (JSONException unused6) {
                    jSONArray = null;
                }
                if (jSONArray != null) {
                    try {
                        jSONArray2 = new JSONArray(jSONArray.toString());
                    } catch (JSONException unused7) {
                    }
                }
                try {
                    jSONObject2 = jSONObjectC.getJSONObject("personalizationMetadata");
                } catch (JSONException unused8) {
                }
                if (jSONObject2 != null) {
                    try {
                        jSONObject4 = new JSONObject(jSONObject2.toString());
                    } catch (JSONException unused9) {
                    }
                }
                return new a.C0317a(0, new C5272mI(jSONObject3, date, jSONArray2, jSONObject4), headerField);
            } catch (JSONException e2) {
                throw new C7232ve0("Fetch failed: fetch response could not be parsed.", e2);
            }
        } catch (IOException | JSONException e3) {
            throw new C7232ve0("The client had an error while calling the backend!", e3);
        }
    }
}
