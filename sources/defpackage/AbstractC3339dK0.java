package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import androidx.constraintlayout.widget.a;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: renamed from: dK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3339dK0 {
    public int a = -1;
    public int b = -1;
    public String c = null;
    public HashMap<String, a> d;

    public abstract void a(HashMap<String, AbstractC6604se2> map);

    @Override // 
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public abstract AbstractC3339dK0 clone();

    public AbstractC3339dK0 c(AbstractC3339dK0 abstractC3339dK0) {
        this.a = abstractC3339dK0.a;
        this.b = abstractC3339dK0.b;
        this.c = abstractC3339dK0.c;
        this.d = abstractC3339dK0.d;
        return this;
    }

    public abstract void d(HashSet<String> hashSet);

    public abstract void e(Context context, AttributeSet attributeSet);

    public void f(HashMap<String, Integer> map) {
    }
}
