package androidx.recyclerview.widget;

import android.annotation.SuppressLint;
import android.view.View;
import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class G extends RecyclerView.j {
    public boolean g;

    @Override // androidx.recyclerview.widget.RecyclerView.j
    public final boolean a(@NonNull RecyclerView.C c, @NonNull RecyclerView.C c2, @NonNull RecyclerView.j.b bVar, @NonNull RecyclerView.j.b bVar2) {
        int i;
        int i2;
        int i3 = bVar.a;
        int i4 = bVar.b;
        if (c2.o()) {
            int i5 = bVar.a;
            i2 = bVar.b;
            i = i5;
        } else {
            i = bVar2.a;
            i2 = bVar2.b;
        }
        o oVar = (o) this;
        if (c == c2) {
            return oVar.g(c, i3, i4, i, i2);
        }
        View view = c.a;
        float translationX = view.getTranslationX();
        float translationY = view.getTranslationY();
        float alpha = view.getAlpha();
        oVar.l(c);
        view.setTranslationX(translationX);
        view.setTranslationY(translationY);
        view.setAlpha(alpha);
        oVar.l(c2);
        float f = -((int) ((i - i3) - translationX));
        View view2 = c2.a;
        view2.setTranslationX(f);
        view2.setTranslationY(-((int) ((i2 - i4) - translationY)));
        view2.setAlpha(0.0f);
        ArrayList<o.a> arrayList = oVar.k;
        o.a aVar = new o.a();
        aVar.a = c;
        aVar.b = c2;
        aVar.c = i3;
        aVar.d = i4;
        aVar.e = i;
        aVar.f = i2;
        arrayList.add(aVar);
        return true;
    }

    @SuppressLint({"UnknownNullness"})
    public abstract boolean g(RecyclerView.C c, int i, int i2, int i3, int i4);
}
