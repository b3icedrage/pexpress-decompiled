package defpackage;

import com.google.android.gms.tasks.Task;
import java.nio.charset.Charset;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: vI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7161vI {
    public static final Pattern e;
    public static final Pattern f;
    public final HashSet a = new HashSet();
    public final Executor b;
    public final C5059lI c;
    public final C5059lI d;

    static {
        Charset.forName("UTF-8");
        e = Pattern.compile("^(1|true|t|yes|y|on)$", 2);
        f = Pattern.compile("^(0|false|f|no|n|off|)$", 2);
    }

    public C7161vI(Executor executor, C5059lI c5059lI, C5059lI c5059lI2) {
        this.b = executor;
        this.c = c5059lI;
        this.d = c5059lI2;
    }

    public static C5272mI a(C5059lI c5059lI) {
        synchronized (c5059lI) {
            try {
                Task<C5272mI> task = c5059lI.c;
                if (task != null && task.isSuccessful()) {
                    return c5059lI.c.getResult();
                }
                try {
                    Task<C5272mI> taskB = c5059lI.b();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    return (C5272mI) C5059lI.a(taskB);
                } catch (InterruptedException | ExecutionException | TimeoutException unused) {
                    return null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static HashSet b(C5059lI c5059lI) {
        HashSet hashSet = new HashSet();
        C5272mI c5272mIA = a(c5059lI);
        if (c5272mIA != null) {
            Iterator<String> itKeys = c5272mIA.b.keys();
            while (itKeys.hasNext()) {
                hashSet.add(itKeys.next());
            }
        }
        return hashSet;
    }
}
