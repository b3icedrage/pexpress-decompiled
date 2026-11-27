package defpackage;

import android.content.Context;
import android.util.Base64OutputStream;
import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.zip.GZIPOutputStream;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: pV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5941pV implements InterfaceC4959ko0, InterfaceC5169lo0 {
    public final C5731oV a;
    public final Context b;
    public final InterfaceC1612Nk1<Ta2> c;
    public final Set<InterfaceC4749jo0> d;
    public final Executor e;

    public C5941pV() {
        throw null;
    }

    public C5941pV(Context context, String str, Set<InterfaceC4749jo0> set, InterfaceC1612Nk1<Ta2> interfaceC1612Nk1, Executor executor) {
        this.a = new C5731oV(context, str);
        this.d = set;
        this.e = executor;
        this.c = interfaceC1612Nk1;
        this.b = context;
    }

    @Override // defpackage.InterfaceC4959ko0
    public final Task<String> a() {
        if (!C6173qb2.a(this.b)) {
            return Tasks.forResult("");
        }
        return Tasks.call(this.e, new Callable() { // from class: mV
            @Override // java.util.concurrent.Callable
            public final Object call() {
                String string;
                C5941pV c5941pV = this.d;
                synchronized (c5941pV) {
                    try {
                        C5382mo0 c5382mo0 = (C5382mo0) c5941pV.a.get();
                        ArrayList arrayListC = c5382mo0.c();
                        c5382mo0.b();
                        JSONArray jSONArray = new JSONArray();
                        for (int i = 0; i < arrayListC.size(); i++) {
                            AbstractC5592no0 abstractC5592no0 = (AbstractC5592no0) arrayListC.get(i);
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("agent", abstractC5592no0.b());
                            jSONObject.put("dates", new JSONArray((Collection) abstractC5592no0.a()));
                            jSONArray.put(jSONObject);
                        }
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("heartbeats", jSONArray);
                        jSONObject2.put("version", "2");
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        Base64OutputStream base64OutputStream = new Base64OutputStream(byteArrayOutputStream, 11);
                        try {
                            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(base64OutputStream);
                            try {
                                gZIPOutputStream.write(jSONObject2.toString().getBytes("UTF-8"));
                                gZIPOutputStream.close();
                                base64OutputStream.close();
                                string = byteArrayOutputStream.toString("UTF-8");
                            } catch (Throwable th) {
                                try {
                                    gZIPOutputStream.close();
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                }
                                throw th;
                            }
                        } catch (Throwable th3) {
                            try {
                                base64OutputStream.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                            throw th3;
                        }
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                return string;
            }
        });
    }

    @Override // defpackage.InterfaceC5169lo0
    @NonNull
    public final synchronized int b() {
        boolean zG;
        long jCurrentTimeMillis = System.currentTimeMillis();
        C5382mo0 c5382mo0 = (C5382mo0) this.a.get();
        synchronized (c5382mo0) {
            zG = c5382mo0.g(jCurrentTimeMillis);
        }
        if (!zG) {
            return 1;
        }
        synchronized (c5382mo0) {
            String strD = c5382mo0.d(System.currentTimeMillis());
            c5382mo0.a.edit().putString("last-used-date", strD).commit();
            c5382mo0.f(strD);
        }
        return 3;
    }

    public final void c() {
        if (this.d.size() <= 0) {
            Tasks.forResult(null);
        } else if (!C6173qb2.a(this.b)) {
            Tasks.forResult(null);
        } else {
            Tasks.call(this.e, new Callable() { // from class: lV
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C5941pV c5941pV = this.d;
                    synchronized (c5941pV) {
                        ((C5382mo0) c5941pV.a.get()).h(c5941pV.c.get().a(), System.currentTimeMillis());
                    }
                    return null;
                }
            });
        }
    }
}
