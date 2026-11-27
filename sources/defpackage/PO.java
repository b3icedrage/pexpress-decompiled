package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: classes.dex */
public final class PO implements Continuation, Jm2 {
    public final Object d;

    public /* synthetic */ PO(Object obj) {
        this.d = obj;
    }

    @Override // com.google.android.gms.tasks.Continuation
    public Object then(@NonNull Task task) {
        return ((Callable) this.d).call();
    }

    @Override // defpackage.Jm2
    public Object zza() {
        C2798an2 c2798an2 = (C2798an2) ((Jm2) this.d).zza();
        if (c2798an2 != null) {
            return c2798an2;
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }
}
