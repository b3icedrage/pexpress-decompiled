package defpackage;

import androidx.annotation.NonNull;
import io.sentry.instrumentation.file.f;
import io.sentry.instrumentation.file.j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: ud1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7019ud1 {
    public File a;

    @NonNull
    public final C1198Id0 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: renamed from: ud1$a */
    public static final class a {
        public static final a d;
        public static final a e;
        public static final a g;
        public static final a h;
        public static final a i;
        public static final /* synthetic */ a[] j;

        static {
            a aVar = new a("ATTEMPT_MIGRATION", 0);
            d = aVar;
            a aVar2 = new a("NOT_GENERATED", 1);
            e = aVar2;
            a aVar3 = new a("UNREGISTERED", 2);
            g = aVar3;
            a aVar4 = new a("REGISTERED", 3);
            h = aVar4;
            a aVar5 = new a("REGISTER_ERROR", 4);
            i = aVar5;
            j = new a[]{aVar, aVar2, aVar3, aVar4, aVar5};
        }

        public a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) j.clone();
        }
    }

    public C7019ud1(@NonNull C1198Id0 c1198Id0) {
        this.b = c1198Id0;
    }

    public final File a() {
        if (this.a == null) {
            synchronized (this) {
                try {
                    if (this.a == null) {
                        C1198Id0 c1198Id0 = this.b;
                        c1198Id0.a();
                        this.a = new File(c1198Id0.a.getFilesDir(), "PersistedInstallation." + this.b.d() + ".json");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return this.a;
    }

    @NonNull
    public final void b(@NonNull C0996Fo c0996Fo) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("Fid", c0996Fo.b);
            jSONObject.put("Status", c0996Fo.c.ordinal());
            jSONObject.put("AuthToken", c0996Fo.d);
            jSONObject.put("RefreshToken", c0996Fo.e);
            jSONObject.put("TokenCreationEpochInSecs", c0996Fo.g);
            jSONObject.put("ExpiresInSecs", c0996Fo.f);
            jSONObject.put("FisError", c0996Fo.h);
            C1198Id0 c1198Id0 = this.b;
            c1198Id0.a();
            File fileCreateTempFile = File.createTempFile("PersistedInstallation", "tmp", c1198Id0.a.getFilesDir());
            FileOutputStream fileOutputStreamB = j.a.b(new FileOutputStream(fileCreateTempFile), fileCreateTempFile);
            fileOutputStreamB.write(jSONObject.toString().getBytes("UTF-8"));
            fileOutputStreamB.close();
            if (fileCreateTempFile.renameTo(a())) {
            } else {
                throw new IOException("unable to rename the tmpfile to PersistedInstallation");
            }
        } catch (IOException | JSONException unused) {
        }
    }

    @NonNull
    public final C0996Fo c() {
        JSONObject jSONObject;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        try {
            File fileA = a();
            FileInputStream fileInputStreamA = f.a.a(fileA, new FileInputStream(fileA));
            while (true) {
                try {
                    int i = fileInputStreamA.read(bArr, 0, 16384);
                    if (i < 0) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr, 0, i);
                } catch (Throwable th) {
                    try {
                        fileInputStreamA.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            }
            jSONObject = new JSONObject(byteArrayOutputStream.toString());
            fileInputStreamA.close();
        } catch (IOException | JSONException unused) {
            jSONObject = new JSONObject();
        }
        String strOptString = jSONObject.optString("Fid", null);
        int iOptInt = jSONObject.optInt("Status", 0);
        String strOptString2 = jSONObject.optString("AuthToken", null);
        String strOptString3 = jSONObject.optString("RefreshToken", null);
        long jOptLong = jSONObject.optLong("TokenCreationEpochInSecs", 0L);
        long jOptLong2 = jSONObject.optLong("ExpiresInSecs", 0L);
        String strOptString4 = jSONObject.optString("FisError", null);
        int i2 = AbstractC7229vd1.a;
        a aVar = a.values()[iOptInt];
        if (aVar != null) {
            return new C0996Fo(strOptString, aVar, strOptString2, strOptString3, jOptLong2, jOptLong, strOptString4);
        }
        throw new NullPointerException("Null registrationStatus");
    }
}
