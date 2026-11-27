package androidx.databinding.library.baseAdapters;

import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.ViewDataBinding;
import defpackage.AbstractC4879kS;
import defpackage.InterfaceC5089lS;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class DataBinderMapperImpl extends AbstractC4879kS {
    public static final SparseIntArray a = new SparseIntArray(0);

    @Override // defpackage.AbstractC4879kS
    public final List<AbstractC4879kS> a() {
        return new ArrayList(0);
    }

    @Override // defpackage.AbstractC4879kS
    public final ViewDataBinding b(InterfaceC5089lS interfaceC5089lS, View view, int i) {
        if (a.get(i) <= 0 || view.getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
