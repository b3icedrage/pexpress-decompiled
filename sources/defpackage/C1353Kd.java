package defpackage;

import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.EnumMap;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Kd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1353Kd implements K81, J71 {
    public final /* synthetic */ Object d;

    public /* synthetic */ C1353Kd(Object obj) {
        this.d = obj;
    }

    @Override // defpackage.K81
    public C3006bj2 N(View view, C3006bj2 c3006bj2) {
        AppBarLayout appBarLayout = (AppBarLayout) this.d;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        C3006bj2 c3006bj3 = appBarLayout.getFitsSystemWindows() ? c3006bj2 : null;
        if (!Objects.equals(appBarLayout.k, c3006bj3)) {
            appBarLayout.k = c3006bj3;
            appBarLayout.setWillNotDraw(!(appBarLayout.y != null && appBarLayout.getTopInset() > 0));
            appBarLayout.requestLayout();
        }
        return c3006bj2;
    }

    @Override // defpackage.J71
    public Object e() {
        Type type = (Type) this.d;
        if (!(type instanceof ParameterizedType)) {
            throw new C2911bH0("Invalid EnumMap type: " + type.toString());
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        if (type2 instanceof Class) {
            return new EnumMap((Class) type2);
        }
        throw new C2911bH0("Invalid EnumMap type: " + type.toString());
    }
}
