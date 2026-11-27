package defpackage;

import android.os.Bundle;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: tR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC6769tR0 {

    /* JADX INFO: renamed from: tR0$a */
    public interface a<D> {
        @NonNull
        C6349rR0<D> onCreateLoader(int i, Bundle bundle);

        void onLoadFinished(@NonNull C6349rR0<D> c6349rR0, D d);

        void onLoaderReset(@NonNull C6349rR0<D> c6349rR0);
    }

    @NonNull
    public static C6979uR0 a(@NonNull FP0 fp0) {
        return new C6979uR0(fp0, ((Wd2) fp0).getViewModelStore());
    }
}
