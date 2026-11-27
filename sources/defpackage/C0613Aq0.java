package defpackage;

import android.util.Log;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;

/* JADX INFO: renamed from: Aq0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0613Aq0 {
    public final String a;
    public final HashMap b;
    public final HashMap c = new HashMap();

    public C0613Aq0(String str, HashMap map) {
        this.a = str;
        this.b = map;
    }

    public static String a(String str, HashMap map) {
        StringBuilder sb = new StringBuilder();
        Iterator it = map.entrySet().iterator();
        Map.Entry entry = (Map.Entry) it.next();
        sb.append((String) entry.getKey());
        sb.append("=");
        sb.append(entry.getValue() != null ? URLEncoder.encode((String) entry.getValue(), "UTF-8") : "");
        while (it.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it.next();
            sb.append("&");
            sb.append((String) entry2.getKey());
            sb.append("=");
            sb.append(entry2.getValue() != null ? URLEncoder.encode((String) entry2.getValue(), "UTF-8") : "");
        }
        String string = sb.toString();
        if (string.isEmpty()) {
            return str;
        }
        if (!str.contains("?")) {
            return C2629a1.b(str, "?", string);
        }
        if (!str.endsWith("&")) {
            string = "&".concat(string);
        }
        return Z0.c(str, string);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009e  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    public final C4968kr0 b() throws Throwable {
        HttpsURLConnection httpsURLConnection;
        InputStream inputStream = null;
        String string = null;
        inputStream = null;
        try {
            String strA = a(this.a, this.b);
            try {
                Log.isLoggable("FirebaseCrashlytics", 2);
                httpsURLConnection = (HttpsURLConnection) new URL(strA).openConnection();
                try {
                    httpsURLConnection.setReadTimeout(10000);
                    httpsURLConnection.setConnectTimeout(10000);
                    httpsURLConnection.setRequestMethod("GET");
                    for (Map.Entry entry : this.c.entrySet()) {
                        httpsURLConnection.addRequestProperty((String) entry.getKey(), (String) entry.getValue());
                    }
                    httpsURLConnection.connect();
                    int responseCode = httpsURLConnection.getResponseCode();
                    InputStream inputStream2 = httpsURLConnection.getInputStream();
                    if (inputStream2 != null) {
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "UTF-8"));
                            char[] cArr = new char[8192];
                            StringBuilder sb = new StringBuilder();
                            while (true) {
                                int i = bufferedReader.read(cArr);
                                if (i == -1) {
                                    break;
                                }
                                sb.append(cArr, 0, i);
                            }
                            string = sb.toString();
                        } catch (Throwable th) {
                            th = th;
                            inputStream = inputStream2;
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            if (httpsURLConnection != null) {
                                httpsURLConnection.disconnect();
                            }
                            throw th;
                        }
                    }
                    if (inputStream2 != null) {
                        inputStream2.close();
                    }
                    httpsURLConnection.disconnect();
                    return new C4968kr0(responseCode, string);
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Throwable th3) {
                th = th3;
                httpsURLConnection = null;
                if (inputStream != null) {
                    inputStream.close();
                }
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public final void c(String str, String str2) {
        this.c.put(str, str2);
    }
}
