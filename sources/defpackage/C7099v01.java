package defpackage;

import android.graphics.PointF;
import java.util.ArrayList;

/* JADX INFO: renamed from: v01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7099v01 {
    public static final PointF a = new PointF();

    public static PointF a(PointF pointF, PointF pointF2) {
        return new PointF(pointF.x + pointF2.x, pointF.y + pointF2.y);
    }

    public static float b(float f, float f2, float f3) {
        return Math.max(f2, Math.min(f3, f));
    }

    public static int c(float f, float f2) {
        int i = (int) f;
        int i2 = (int) f2;
        int i3 = i / i2;
        int i4 = i % i2;
        if (!((i ^ i2) >= 0) && i4 != 0) {
            i3--;
        }
        return i - (i2 * i3);
    }

    public static float d(float f, float f2, float f3) {
        return BX.a(f2, f, f3, f);
    }

    public static void e(C5279mK0 c5279mK0, int i, ArrayList arrayList, C5279mK0 c5279mK1, InterfaceC5699oK0 interfaceC5699oK0) {
        if (c5279mK0.a(i, interfaceC5699oK0.getName())) {
            String name = interfaceC5699oK0.getName();
            C5279mK0 c5279mK2 = new C5279mK0(c5279mK1);
            c5279mK2.a.add(name);
            C5279mK0 c5279mK3 = new C5279mK0(c5279mK2);
            c5279mK3.b = interfaceC5699oK0;
            arrayList.add(c5279mK3);
        }
    }
}
