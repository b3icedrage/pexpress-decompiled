package defpackage;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class Vj2 extends G1 {
    public static final String m = AS0.d("WorkContinuationImpl");
    public final C4736jk2 e;
    public final String f;
    public final EnumC5957pa0 g;
    public final List<? extends AbstractC8099zk2> h;
    public final ArrayList i;
    public final ArrayList j = new ArrayList();
    public boolean k;
    public R91 l;

    public Vj2(@NonNull C4736jk2 c4736jk2, String str, @NonNull EnumC5957pa0 enumC5957pa0, @NonNull List list) {
        this.e = c4736jk2;
        this.f = str;
        this.g = enumC5957pa0;
        this.h = list;
        this.i = new ArrayList(list.size());
        for (int i = 0; i < list.size(); i++) {
            String string = ((AbstractC8099zk2) list.get(i)).a.toString();
            Intrinsics.checkNotNullExpressionValue(string, "id.toString()");
            this.i.add(string);
            this.j.add(string);
        }
    }

    @NonNull
    public static HashSet x(@NonNull Vj2 vj2) {
        HashSet hashSet = new HashSet();
        vj2.getClass();
        return hashSet;
    }

    @NonNull
    public final P91 w() {
        if (this.k) {
            AS0.c().e(m, "Already enqueued work ids (" + TextUtils.join(", ", this.i) + ")");
        } else {
            RunnableC3087c70 runnableC3087c70 = new RunnableC3087c70(this);
            this.e.d.a(runnableC3087c70);
            this.l = runnableC3087c70.e;
        }
        return this.l;
    }
}
