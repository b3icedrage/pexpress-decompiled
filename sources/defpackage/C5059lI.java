package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.OnCanceledListener;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: lI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5059lI {
    public static final HashMap d = new HashMap();
    public static final ExecutorC4468ii1 e = new ExecutorC4468ii1();
    public final Executor a;
    public final AI b;
    public Task<C5272mI> c = null;

    /* JADX INFO: renamed from: lI$a */
    public static class a<TResult> implements OnSuccessListener<TResult>, OnFailureListener, OnCanceledListener {
        public final CountDownLatch d = new CountDownLatch(1);

        @Override // com.google.android.gms.tasks.OnCanceledListener
        public final void onCanceled() {
            this.d.countDown();
        }

        @Override // com.google.android.gms.tasks.OnFailureListener
        public final void onFailure(@NonNull Exception exc) {
            this.d.countDown();
        }

        @Override // com.google.android.gms.tasks.OnSuccessListener
        public final void onSuccess(TResult tresult) {
            this.d.countDown();
        }
    }

    public C5059lI(Executor executor, AI ai) {
        this.a = executor;
        this.b = ai;
    }

    public static Object a(Task task) throws ExecutionException, TimeoutException {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        a aVar = new a();
        Executor executor = e;
        task.addOnSuccessListener(executor, aVar);
        task.addOnFailureListener(executor, aVar);
        task.addOnCanceledListener(executor, aVar);
        if (!aVar.d.await(5L, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (task.isSuccessful()) {
            return task.getResult();
        }
        throw new ExecutionException(task.getException());
    }

    public final synchronized Task<C5272mI> b() {
        try {
            Task<C5272mI> task = this.c;
            if (task == null || (task.isComplete() && !this.c.isSuccessful())) {
                Executor executor = this.a;
                final AI ai = this.b;
                this.c = Tasks.call(executor, new Callable() { // from class: iI
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        FileInputStream fileInputStreamOpenFileInput;
                        Throwable th;
                        AI ai2 = ai;
                        synchronized (ai2) {
                            try {
                                try {
                                    fileInputStreamOpenFileInput = ai2.a.openFileInput(ai2.b);
                                    try {
                                        int iAvailable = fileInputStreamOpenFileInput.available();
                                        byte[] bArr = new byte[iAvailable];
                                        fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                        C5272mI c5272mIA = C5272mI.a(new JSONObject(new String(bArr, "UTF-8")));
                                        fileInputStreamOpenFileInput.close();
                                        return c5272mIA;
                                    } catch (FileNotFoundException | JSONException unused) {
                                        if (fileInputStreamOpenFileInput != null) {
                                            fileInputStreamOpenFileInput.close();
                                        }
                                        return null;
                                    } catch (Throwable th2) {
                                        th = th2;
                                        if (fileInputStreamOpenFileInput != null) {
                                            fileInputStreamOpenFileInput.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th3) {
                                    throw th3;
                                }
                            } catch (FileNotFoundException | JSONException unused2) {
                                fileInputStreamOpenFileInput = null;
                            } catch (Throwable th4) {
                                fileInputStreamOpenFileInput = null;
                                th = th4;
                            }
                        }
                    }
                });
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.c;
    }
}
