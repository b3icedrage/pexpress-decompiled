package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class Id2 implements Sequence<View> {
    final /* synthetic */ ViewGroup a;

    public Id2(ViewGroup viewGroup) {
        this.a = viewGroup;
    }

    @Override // kotlin.sequences.Sequence
    @NotNull
    public final Iterator<View> iterator() {
        return new Jd2(this.a);
    }
}
