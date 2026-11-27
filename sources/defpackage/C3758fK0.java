package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import io.sentry.android.core.b0;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: fK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3758fK0 extends AbstractC3339dK0 {
    public int e = 0;
    public int f = -1;
    public String g = null;
    public float h = Float.NaN;
    public float i = 0.0f;
    public float j = 0.0f;
    public float k = Float.NaN;
    public int l = -1;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public float r = Float.NaN;
    public float s = Float.NaN;
    public float t = Float.NaN;
    public float u = Float.NaN;
    public float v = Float.NaN;
    public float w = Float.NaN;

    /* JADX INFO: renamed from: fK0$a */
    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(13, 1);
            sparseIntArray.append(11, 2);
            sparseIntArray.append(14, 3);
            sparseIntArray.append(10, 4);
            sparseIntArray.append(19, 5);
            sparseIntArray.append(17, 6);
            sparseIntArray.append(16, 7);
            sparseIntArray.append(20, 8);
            sparseIntArray.append(0, 9);
            sparseIntArray.append(9, 10);
            sparseIntArray.append(5, 11);
            sparseIntArray.append(6, 12);
            sparseIntArray.append(7, 13);
            sparseIntArray.append(15, 14);
            sparseIntArray.append(3, 15);
            sparseIntArray.append(4, 16);
            sparseIntArray.append(1, 17);
            sparseIntArray.append(2, 18);
            sparseIntArray.append(8, 19);
            sparseIntArray.append(12, 20);
            sparseIntArray.append(18, 21);
        }
    }

    public C3758fK0() {
        this.d = new HashMap<>();
    }

    @Override // defpackage.AbstractC3339dK0
    public final void a(HashMap<String, AbstractC6604se2> map) {
        throw null;
    }

    @Override // defpackage.AbstractC3339dK0
    /* JADX INFO: renamed from: b */
    public final AbstractC3339dK0 clone() {
        C3758fK0 c3758fK0 = new C3758fK0();
        super.c(this);
        c3758fK0.e = this.e;
        c3758fK0.f = this.f;
        c3758fK0.g = this.g;
        c3758fK0.h = this.h;
        c3758fK0.i = this.i;
        c3758fK0.j = this.j;
        c3758fK0.k = this.k;
        c3758fK0.l = this.l;
        c3758fK0.m = this.m;
        c3758fK0.n = this.n;
        c3758fK0.o = this.o;
        c3758fK0.p = this.p;
        c3758fK0.q = this.q;
        c3758fK0.r = this.r;
        c3758fK0.s = this.s;
        c3758fK0.t = this.t;
        c3758fK0.u = this.u;
        c3758fK0.v = this.v;
        c3758fK0.w = this.w;
        return c3758fK0;
    }

    @Override // defpackage.AbstractC3339dK0
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.m)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.r)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.s)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.t)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.u)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.v)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.w)) {
            hashSet.add("translationZ");
        }
        if (this.d.size() > 0) {
            Iterator<String> it = this.d.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM," + it.next());
            }
        }
    }

    @Override // defpackage.AbstractC3339dK0
    public final void e(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2425Xl1.g);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = a.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    if (MotionLayout.K0) {
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                        this.b = resourceId;
                        if (resourceId == -1) {
                            this.c = typedArrayObtainStyledAttributes.getString(index);
                        }
                    } else if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.c = typedArrayObtainStyledAttributes.getString(index);
                    } else {
                        this.b = typedArrayObtainStyledAttributes.getResourceId(index, this.b);
                    }
                    break;
                case 2:
                    this.a = typedArrayObtainStyledAttributes.getInt(index, this.a);
                    break;
                case 3:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 4:
                    this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 5:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        this.g = typedArrayObtainStyledAttributes.getString(index);
                        this.f = 7;
                    } else {
                        this.f = typedArrayObtainStyledAttributes.getInt(index, this.f);
                    }
                    break;
                case 6:
                    this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 7:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.i = typedArrayObtainStyledAttributes.getDimension(index, this.i);
                    } else {
                        this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    }
                    break;
                case 8:
                    this.l = typedArrayObtainStyledAttributes.getInt(index, this.l);
                    break;
                case 9:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 10:
                    this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 11:
                    this.o = typedArrayObtainStyledAttributes.getFloat(index, this.o);
                    break;
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    this.q = typedArrayObtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 13:
                    this.r = typedArrayObtainStyledAttributes.getFloat(index, this.r);
                    break;
                case 14:
                    this.p = typedArrayObtainStyledAttributes.getFloat(index, this.p);
                    break;
                case 15:
                    this.s = typedArrayObtainStyledAttributes.getFloat(index, this.s);
                    break;
                case 16:
                    this.t = typedArrayObtainStyledAttributes.getFloat(index, this.t);
                    break;
                case 17:
                    this.u = typedArrayObtainStyledAttributes.getDimension(index, this.u);
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    this.v = typedArrayObtainStyledAttributes.getDimension(index, this.v);
                    break;
                case 19:
                    this.w = typedArrayObtainStyledAttributes.getDimension(index, this.w);
                    break;
                case 20:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j) / 360.0f;
                    break;
                default:
                    b0.c("KeyCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
            }
        }
    }

    public final void g(HashMap<String, Zd2> map) {
        float f;
        Zd2 zd2;
        Zd2 zd3;
        int i = 7;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                androidx.constraintlayout.widget.a aVar = this.d.get(str.substring(i));
                if (aVar != null) {
                    if (aVar.c == androidx.constraintlayout.widget.a.EnumC0226a.e && (zd3 = map.get(str)) != null) {
                        int i2 = this.a;
                        int i3 = this.f;
                        String str2 = this.g;
                        int i4 = this.l;
                        zd3.f.add(new AbstractC4178hK0.b(this.h, this.i, this.j, aVar.a(), i2));
                        if (i4 != -1) {
                            zd3.e = i4;
                        }
                        zd3.c = i3;
                        zd3.b(aVar);
                        zd3.d = str2;
                    }
                }
            } else {
                switch (str) {
                    case "rotationX":
                        f = this.q;
                        break;
                    case "rotationY":
                        f = this.r;
                        break;
                    case "translationX":
                        f = this.u;
                        break;
                    case "translationY":
                        f = this.v;
                        break;
                    case "translationZ":
                        f = this.w;
                        break;
                    case "progress":
                        f = this.k;
                        break;
                    case "scaleX":
                        f = this.s;
                        break;
                    case "scaleY":
                        f = this.t;
                        break;
                    case "rotation":
                        f = this.o;
                        break;
                    case "elevation":
                        f = this.n;
                        break;
                    case "transitionPathRotate":
                        f = this.p;
                        break;
                    case "alpha":
                        f = this.m;
                        break;
                    case "waveOffset":
                        f = this.i;
                        break;
                    case "wavePhase":
                        f = this.j;
                        break;
                    default:
                        str.startsWith("CUSTOM");
                        f = Float.NaN;
                        break;
                }
                float f2 = f;
                if (!Float.isNaN(f2) && (zd2 = map.get(str)) != null) {
                    int i5 = this.a;
                    int i6 = this.f;
                    String str3 = this.g;
                    int i7 = this.l;
                    zd2.f.add(new AbstractC4178hK0.b(this.h, this.i, this.j, f2, i5));
                    if (i7 != -1) {
                        zd2.e = i7;
                    }
                    zd2.c = i6;
                    zd2.d = str3;
                }
            }
            i = 7;
        }
    }
}
