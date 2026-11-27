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

/* JADX INFO: renamed from: sK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6538sK0 extends AbstractC3339dK0 {
    public int e = -1;
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = Float.NaN;
    public float j = Float.NaN;
    public float k = Float.NaN;
    public float l = Float.NaN;
    public float m = Float.NaN;
    public float n = Float.NaN;
    public float o = Float.NaN;
    public float p = Float.NaN;
    public float q = Float.NaN;
    public int r = 0;
    public float s = Float.NaN;
    public float t = 0.0f;

    /* JADX INFO: renamed from: sK0$a */
    public static class a {
        public static final SparseIntArray a;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            a = sparseIntArray;
            sparseIntArray.append(0, 1);
            sparseIntArray.append(9, 2);
            sparseIntArray.append(5, 4);
            sparseIntArray.append(6, 5);
            sparseIntArray.append(7, 6);
            sparseIntArray.append(3, 7);
            sparseIntArray.append(15, 8);
            sparseIntArray.append(14, 9);
            sparseIntArray.append(13, 10);
            sparseIntArray.append(11, 12);
            sparseIntArray.append(10, 13);
            sparseIntArray.append(4, 14);
            sparseIntArray.append(1, 15);
            sparseIntArray.append(2, 16);
            sparseIntArray.append(8, 17);
            sparseIntArray.append(12, 18);
            sparseIntArray.append(18, 20);
            sparseIntArray.append(17, 21);
            sparseIntArray.append(20, 19);
        }
    }

    public C6538sK0() {
        this.d = new HashMap<>();
    }

    @Override // defpackage.AbstractC3339dK0
    public final void a(HashMap<String, AbstractC6604se2> map) {
        throw null;
    }

    @Override // defpackage.AbstractC3339dK0
    /* JADX INFO: renamed from: b */
    public final AbstractC3339dK0 clone() {
        C6538sK0 c6538sK0 = new C6538sK0();
        super.c(this);
        c6538sK0.e = this.e;
        c6538sK0.r = this.r;
        c6538sK0.s = this.s;
        c6538sK0.t = this.t;
        c6538sK0.q = this.q;
        c6538sK0.f = this.f;
        c6538sK0.g = this.g;
        c6538sK0.h = this.h;
        c6538sK0.k = this.k;
        c6538sK0.i = this.i;
        c6538sK0.j = this.j;
        c6538sK0.l = this.l;
        c6538sK0.m = this.m;
        c6538sK0.n = this.n;
        c6538sK0.o = this.o;
        c6538sK0.p = this.p;
        return c6538sK0;
    }

    @Override // defpackage.AbstractC3339dK0
    public final void d(HashSet<String> hashSet) {
        if (!Float.isNaN(this.f)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.g)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.h)) {
            hashSet.add("rotation");
        }
        if (!Float.isNaN(this.i)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.j)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.n)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.o)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.p)) {
            hashSet.add("translationZ");
        }
        if (!Float.isNaN(this.k)) {
            hashSet.add("transitionPathRotate");
        }
        if (!Float.isNaN(this.l)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.m)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.q)) {
            hashSet.add("progress");
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
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2425Xl1.i);
        SparseIntArray sparseIntArray = a.a;
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i);
            SparseIntArray sparseIntArray2 = a.a;
            switch (sparseIntArray2.get(index)) {
                case 1:
                    this.f = typedArrayObtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 2:
                    this.g = typedArrayObtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 3:
                case 11:
                default:
                    b0.c("KeyTimeCycle", "unused attribute 0x" + Integer.toHexString(index) + "   " + sparseIntArray2.get(index));
                    break;
                case 4:
                    this.h = typedArrayObtainStyledAttributes.getFloat(index, this.h);
                    break;
                case 5:
                    this.i = typedArrayObtainStyledAttributes.getFloat(index, this.i);
                    break;
                case 6:
                    this.j = typedArrayObtainStyledAttributes.getFloat(index, this.j);
                    break;
                case 7:
                    this.l = typedArrayObtainStyledAttributes.getFloat(index, this.l);
                    break;
                case 8:
                    this.k = typedArrayObtainStyledAttributes.getFloat(index, this.k);
                    break;
                case 9:
                    typedArrayObtainStyledAttributes.getString(index);
                    break;
                case 10:
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
                case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                    this.a = typedArrayObtainStyledAttributes.getInt(index, this.a);
                    break;
                case 13:
                    this.e = typedArrayObtainStyledAttributes.getInteger(index, this.e);
                    break;
                case 14:
                    this.m = typedArrayObtainStyledAttributes.getFloat(index, this.m);
                    break;
                case 15:
                    this.n = typedArrayObtainStyledAttributes.getDimension(index, this.n);
                    break;
                case 16:
                    this.o = typedArrayObtainStyledAttributes.getDimension(index, this.o);
                    break;
                case 17:
                    this.p = typedArrayObtainStyledAttributes.getDimension(index, this.p);
                    break;
                case ConnectionResult.SERVICE_UPDATING /* 18 */:
                    this.q = typedArrayObtainStyledAttributes.getFloat(index, this.q);
                    break;
                case 19:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                        typedArrayObtainStyledAttributes.getString(index);
                        this.r = 7;
                    } else {
                        this.r = typedArrayObtainStyledAttributes.getInt(index, this.r);
                    }
                    break;
                case 20:
                    this.s = typedArrayObtainStyledAttributes.getFloat(index, this.s);
                    break;
                case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                    if (typedArrayObtainStyledAttributes.peekValue(index).type == 5) {
                        this.t = typedArrayObtainStyledAttributes.getDimension(index, this.t);
                    } else {
                        this.t = typedArrayObtainStyledAttributes.getFloat(index, this.t);
                    }
                    break;
            }
        }
    }

    @Override // defpackage.AbstractC3339dK0
    public final void f(HashMap<String, Integer> map) {
        if (this.e == -1) {
            return;
        }
        if (!Float.isNaN(this.f)) {
            map.put("alpha", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.g)) {
            map.put("elevation", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.h)) {
            map.put("rotation", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.i)) {
            map.put("rotationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.j)) {
            map.put("rotationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.n)) {
            map.put("translationX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.o)) {
            map.put("translationY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.p)) {
            map.put("translationZ", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.k)) {
            map.put("transitionPathRotate", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            map.put("scaleX", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.l)) {
            map.put("scaleY", Integer.valueOf(this.e));
        }
        if (!Float.isNaN(this.q)) {
            map.put("progress", Integer.valueOf(this.e));
        }
        if (this.d.size() > 0) {
            Iterator<String> it = this.d.keySet().iterator();
            while (it.hasNext()) {
                map.put(C5491nL.c("CUSTOM,", it.next()), Integer.valueOf(this.e));
            }
        }
    }

    public final void g(HashMap<String, Ae2> map) {
        for (String str : map.keySet()) {
            Ae2 ae2 = map.get(str);
            if (ae2 != null) {
                if (!str.startsWith("CUSTOM")) {
                    switch (str) {
                        case "rotationX":
                            if (Float.isNaN(this.i)) {
                                break;
                            } else {
                                ae2.b(this.i, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "rotationY":
                            if (Float.isNaN(this.j)) {
                                break;
                            } else {
                                ae2.b(this.j, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "translationX":
                            if (Float.isNaN(this.n)) {
                                break;
                            } else {
                                ae2.b(this.n, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "translationY":
                            if (Float.isNaN(this.o)) {
                                break;
                            } else {
                                ae2.b(this.o, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "translationZ":
                            if (Float.isNaN(this.p)) {
                                break;
                            } else {
                                ae2.b(this.p, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "progress":
                            if (Float.isNaN(this.q)) {
                                break;
                            } else {
                                ae2.b(this.q, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "scaleX":
                            if (Float.isNaN(this.l)) {
                                break;
                            } else {
                                ae2.b(this.l, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "scaleY":
                            if (Float.isNaN(this.m)) {
                                break;
                            } else {
                                ae2.b(this.m, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "rotation":
                            if (Float.isNaN(this.h)) {
                                break;
                            } else {
                                ae2.b(this.h, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "elevation":
                            if (Float.isNaN(this.g)) {
                                break;
                            } else {
                                ae2.b(this.g, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "transitionPathRotate":
                            if (Float.isNaN(this.k)) {
                                break;
                            } else {
                                ae2.b(this.k, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        case "alpha":
                            if (Float.isNaN(this.f)) {
                                break;
                            } else {
                                ae2.b(this.f, this.s, this.t, this.a, this.r);
                                break;
                            }
                            break;
                        default:
                            b0.c("KeyTimeCycles", "UNKNOWN addValues \"" + str + "\"");
                            break;
                    }
                } else {
                    androidx.constraintlayout.widget.a aVar = this.d.get(str.substring(7));
                    if (aVar != null) {
                        Ae2.b bVar = (Ae2.b) ae2;
                        int i = this.a;
                        float f = this.s;
                        int i2 = this.r;
                        float f2 = this.t;
                        bVar.l.append(i, aVar);
                        bVar.m.append(i, new float[]{f, f2});
                        bVar.b = Math.max(bVar.b, i2);
                    }
                }
            }
        }
    }
}
