package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.chip.Chip;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Fa0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0955Fa0 extends R1 {
    public static final Rect n = new Rect(Api.BaseClientBuilder.API_PRIORITY_OTHER, Api.BaseClientBuilder.API_PRIORITY_OTHER, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final a o = new a();
    public static final b p = new b();
    public final AccessibilityManager h;
    public final Chip i;
    public c j;
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    /* JADX INFO: renamed from: Fa0$a */
    public class a {
    }

    /* JADX INFO: renamed from: Fa0$b */
    public class b {
    }

    /* JADX INFO: renamed from: Fa0$c */
    public class c extends C6056q2 {
        public c() {
        }

        @Override // defpackage.C6056q2
        public final C5426n2 a(int i) {
            return new C5426n2(AccessibilityNodeInfo.obtain(AbstractC0955Fa0.this.n(i).a));
        }

        @Override // defpackage.C6056q2
        public final C5426n2 b(int i) {
            AbstractC0955Fa0 abstractC0955Fa0 = AbstractC0955Fa0.this;
            int i2 = i == 2 ? abstractC0955Fa0.k : abstractC0955Fa0.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return a(i2);
        }

        @Override // defpackage.C6056q2
        public final boolean c(int i, int i2, Bundle bundle) {
            int i3;
            AbstractC0955Fa0 abstractC0955Fa0 = AbstractC0955Fa0.this;
            Chip chip = abstractC0955Fa0.i;
            if (i == -1) {
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                return chip.performAccessibilityAction(i2, bundle);
            }
            if (i2 == 1) {
                return abstractC0955Fa0.p(i);
            }
            if (i2 == 2) {
                return abstractC0955Fa0.j(i);
            }
            boolean z = false;
            if (i2 == 64) {
                AccessibilityManager accessibilityManager = abstractC0955Fa0.h;
                if (!accessibilityManager.isEnabled() || !accessibilityManager.isTouchExplorationEnabled() || (i3 = abstractC0955Fa0.k) == i) {
                    return false;
                }
                if (i3 != Integer.MIN_VALUE) {
                    abstractC0955Fa0.k = Integer.MIN_VALUE;
                    abstractC0955Fa0.i.invalidate();
                    abstractC0955Fa0.q(i3, 65536);
                }
                abstractC0955Fa0.k = i;
                chip.invalidate();
                abstractC0955Fa0.q(i, 32768);
                return true;
            }
            if (i2 == 128) {
                if (abstractC0955Fa0.k != i) {
                    return false;
                }
                abstractC0955Fa0.k = Integer.MIN_VALUE;
                chip.invalidate();
                abstractC0955Fa0.q(i, 65536);
                return true;
            }
            Chip.b bVar = (Chip.b) abstractC0955Fa0;
            if (i2 == 16) {
                Chip chip2 = Chip.this;
                if (i == 0) {
                    return chip2.performClick();
                }
                if (i == 1) {
                    chip2.playSoundEffect(0);
                    View.OnClickListener onClickListener = chip2.l;
                    if (onClickListener != null) {
                        onClickListener.onClick(chip2);
                        z = true;
                    }
                    if (chip2.x) {
                        chip2.w.q(1, 1);
                    }
                }
            }
            return z;
        }
    }

    public AbstractC0955Fa0(@NonNull Chip chip) {
        this.i = chip;
        this.h = (AccessibilityManager) chip.getContext().getSystemService("accessibility");
        chip.setFocusable(true);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        if (chip.getImportantForAccessibility() == 0) {
            chip.setImportantForAccessibility(1);
        }
    }

    @Override // defpackage.R1
    public final C6056q2 b(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    @Override // defpackage.R1
    public final void d(View view, C5426n2 c5426n2) {
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        AccessibilityNodeInfo accessibilityNodeInfo = c5426n2.a;
        accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        Chip chip = Chip.this;
        com.google.android.material.chip.a aVar = chip.i;
        accessibilityNodeInfo.setCheckable(aVar != null && aVar.U);
        accessibilityNodeInfo.setClickable(chip.isClickable());
        c5426n2.i(chip.getAccessibilityClassName());
        c5426n2.m(chip.getText());
    }

    public final boolean j(int i) {
        if (this.l != i) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        Chip.b bVar = (Chip.b) this;
        if (i == 1) {
            Chip chip = Chip.this;
            chip.r = false;
            chip.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    @NonNull
    public final C5426n2 k(int i) {
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain();
        C5426n2 c5426n2 = new C5426n2(accessibilityNodeInfoObtain);
        accessibilityNodeInfoObtain.setEnabled(true);
        accessibilityNodeInfoObtain.setFocusable(true);
        c5426n2.i("android.view.View");
        Rect rect = n;
        accessibilityNodeInfoObtain.setBoundsInParent(rect);
        accessibilityNodeInfoObtain.setBoundsInScreen(rect);
        Chip chip = this.i;
        accessibilityNodeInfoObtain.setParent(chip);
        o(i, c5426n2);
        if (c5426n2.g() == null && accessibilityNodeInfoObtain.getContentDescription() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        Rect rect2 = this.e;
        c5426n2.f(rect2);
        if (rect2.equals(rect)) {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
        int actions = accessibilityNodeInfoObtain.getActions();
        if ((actions & 64) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        if ((actions & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
        }
        accessibilityNodeInfoObtain.setPackageName(chip.getContext().getPackageName());
        c5426n2.b = i;
        accessibilityNodeInfoObtain.setSource(chip, i);
        if (this.k == i) {
            accessibilityNodeInfoObtain.setAccessibilityFocused(true);
            c5426n2.a(UserVerificationMethods.USER_VERIFY_PATTERN);
        } else {
            accessibilityNodeInfoObtain.setAccessibilityFocused(false);
            c5426n2.a(64);
        }
        boolean z = this.l == i;
        if (z) {
            c5426n2.a(2);
        } else if (accessibilityNodeInfoObtain.isFocusable()) {
            c5426n2.a(1);
        }
        accessibilityNodeInfoObtain.setFocused(z);
        int[] iArr = this.g;
        chip.getLocationOnScreen(iArr);
        Rect rect3 = this.d;
        accessibilityNodeInfoObtain.getBoundsInScreen(rect3);
        if (rect3.equals(rect)) {
            c5426n2.f(rect3);
            rect3.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
        }
        Rect rect4 = this.f;
        if (chip.getLocalVisibleRect(rect4)) {
            rect4.offset(iArr[0] - chip.getScrollX(), iArr[1] - chip.getScrollY());
            if (rect3.intersect(rect4)) {
                accessibilityNodeInfoObtain.setBoundsInScreen(rect3);
                if (!rect3.isEmpty() && chip.getWindowVisibility() == 0) {
                    Object parent = chip.getParent();
                    while (parent instanceof View) {
                        View view = (View) parent;
                        if (view.getAlpha() > 0.0f && view.getVisibility() == 0) {
                            parent = view.getParent();
                        }
                    }
                    if (parent != null) {
                        accessibilityNodeInfoObtain.setVisibleToUser(true);
                    }
                }
            }
        }
        return c5426n2;
    }

    public abstract void l(ArrayList arrayList);

    /* JADX WARN: Code duplicated, block: B:122:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x00c2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:44:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:46:0x00da  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:51:0x010c  */
    /* JADX WARN: Code duplicated, block: B:54:0x0115  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    /* JADX WARN: Code duplicated, block: B:66:0x0137  */
    /* JADX WARN: Code duplicated, block: B:68:0x0155  */
    /* JADX WARN: Code duplicated, block: B:89:0x01b2  */
    public final boolean m(int i, Rect rect) {
        int i2;
        int i3;
        Object obj;
        Object obj2;
        C5426n2 c5426n2;
        int i4;
        Rect rect2;
        int iG;
        Rect rect3;
        int i5;
        C5426n2 c5426n3;
        int i6;
        int iD;
        int iE;
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        C5502nO1 c5502nO1 = new C5502nO1();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            c5502nO1.e(((Integer) arrayList.get(i7)).intValue(), k(((Integer) arrayList.get(i7)).intValue()));
        }
        int i8 = this.l;
        int i9 = Integer.MIN_VALUE;
        C5426n2 c5426n4 = i8 == Integer.MIN_VALUE ? null : (C5426n2) c5502nO1.d(i8, null);
        a aVar = o;
        b bVar = p;
        Chip chip = this.i;
        if (i == 1 || i == 2) {
            i2 = 0;
            i3 = -1;
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            boolean z = chip.getLayoutDirection() == 1;
            bVar.getClass();
            int iG2 = c5502nO1.g();
            ArrayList arrayList2 = new ArrayList(iG2);
            for (int i10 = 0; i10 < iG2; i10++) {
                arrayList2.add((C5426n2) c5502nO1.h(i10));
            }
            Collections.sort(arrayList2, new C1677Og0.a(z, aVar));
            if (i == 1) {
                int size = arrayList2.size();
                if (c5426n4 != null) {
                    size = arrayList2.indexOf(c5426n4);
                }
                int i11 = size - 1;
                if (i11 >= 0) {
                    obj = arrayList2.get(i11);
                    obj2 = obj;
                } else {
                    obj2 = null;
                }
            } else {
                if (i != 2) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}.");
                }
                int size2 = arrayList2.size();
                int iLastIndexOf = (c5426n4 == null ? -1 : arrayList2.lastIndexOf(c5426n4)) + 1;
                if (iLastIndexOf < size2) {
                    obj = arrayList2.get(iLastIndexOf);
                    obj2 = obj;
                } else {
                    obj2 = null;
                }
            }
            c5426n2 = (C5426n2) obj2;
        } else {
            if (i != 17 && i != 33 && i != 66 && i != 130) {
                throw new IllegalArgumentException("direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
            }
            Rect rect4 = new Rect();
            int i12 = this.l;
            if (i12 != Integer.MIN_VALUE) {
                n(i12).f(rect4);
            } else {
                if (rect != null) {
                    rect4.set(rect);
                } else {
                    int width = chip.getWidth();
                    int height = chip.getHeight();
                    if (i == 17) {
                        i3 = -1;
                        rect4.set(width, 0, width, height);
                    } else if (i == 33) {
                        i3 = -1;
                        rect4.set(0, height, width, height);
                    } else if (i == 66) {
                        rect4.set(-1, 0, -1, height);
                        i3 = -1;
                    } else {
                        if (i != 130) {
                            throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                        }
                        rect4.set(0, -1, width, -1);
                        i3 = -1;
                    }
                }
                rect2 = new Rect(rect4);
                if (i != 17) {
                    i2 = 0;
                    rect2.offset(rect4.width() + 1, 0);
                } else if (i != 33) {
                    i2 = 0;
                    rect2.offset(0, rect4.height() + 1);
                } else if (i != 66) {
                    i2 = 0;
                    rect2.offset(-(rect4.width() + 1), 0);
                } else {
                    if (i == 130) {
                        throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                    }
                    i2 = 0;
                    rect2.offset(0, -(rect4.height() + 1));
                }
                bVar.getClass();
                iG = c5502nO1.g();
                rect3 = new Rect();
                c5426n2 = null;
                for (i5 = i2; i5 < iG; i5++) {
                    c5426n3 = (C5426n2) c5502nO1.h(i5);
                    if (c5426n3 == c5426n4) {
                        aVar.getClass();
                        c5426n3.f(rect3);
                        if (C1677Og0.c(i, rect4, rect3)) {
                            if (C1677Og0.c(i, rect4, rect2) || C1677Og0.a(i, rect4, rect3, rect2)) {
                                rect2.set(rect3);
                                c5426n2 = c5426n3;
                            } else if (C1677Og0.a(i, rect4, rect2, rect3)) {
                                int iD2 = C1677Og0.d(i, rect4, rect3);
                                int iE2 = C1677Og0.e(i, rect4, rect3);
                                i6 = (iE2 * iE2) + (iD2 * 13 * iD2);
                                iD = C1677Og0.d(i, rect4, rect2);
                                iE = C1677Og0.e(i, rect4, rect2);
                                if (i6 < (iE * iE) + (iD * 13 * iD)) {
                                    rect2.set(rect3);
                                    c5426n2 = c5426n3;
                                }
                            }
                        }
                    }
                }
            }
            i3 = -1;
            rect2 = new Rect(rect4);
            if (i != 17) {
                i2 = 0;
                rect2.offset(rect4.width() + 1, 0);
            } else if (i != 33) {
                i2 = 0;
                rect2.offset(0, rect4.height() + 1);
            } else if (i != 66) {
                i2 = 0;
                rect2.offset(-(rect4.width() + 1), 0);
            } else {
                if (i == 130) {
                    throw new IllegalArgumentException("direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}.");
                }
                i2 = 0;
                rect2.offset(0, -(rect4.height() + 1));
            }
            bVar.getClass();
            iG = c5502nO1.g();
            rect3 = new Rect();
            c5426n2 = null;
            while (i5 < iG) {
                c5426n3 = (C5426n2) c5502nO1.h(i5);
                if (c5426n3 == c5426n4) {
                    aVar.getClass();
                    c5426n3.f(rect3);
                    if (C1677Og0.c(i, rect4, rect3)) {
                        if (C1677Og0.c(i, rect4, rect2)) {
                            rect2.set(rect3);
                            c5426n2 = c5426n3;
                        } else if (C1677Og0.a(i, rect4, rect2, rect3)) {
                            int iD3 = C1677Og0.d(i, rect4, rect3);
                            int iE3 = C1677Og0.e(i, rect4, rect3);
                            i6 = (iE3 * iE3) + (iD3 * 13 * iD3);
                            iD = C1677Og0.d(i, rect4, rect2);
                            iE = C1677Og0.e(i, rect4, rect2);
                            if (i6 < (iE * iE) + (iD * 13 * iD)) {
                                rect2.set(rect3);
                                c5426n2 = c5426n3;
                            }
                        }
                    }
                }
            }
        }
        C5426n2 c5426n5 = c5426n2;
        if (c5426n5 != null) {
            if (c5502nO1.d) {
                c5502nO1.b();
            }
            int i13 = i2;
            while (true) {
                if (i13 >= c5502nO1.h) {
                    i4 = i3;
                    break;
                }
                if (c5502nO1.g[i13] == c5426n5) {
                    i4 = i13;
                    break;
                }
                i13++;
            }
            if (c5502nO1.d) {
                c5502nO1.b();
            }
            i9 = c5502nO1.e[i4];
        }
        return p(i9);
    }

    @NonNull
    public final C5426n2 n(int i) {
        if (i != -1) {
            return k(i);
        }
        Chip chip = this.i;
        AccessibilityNodeInfo accessibilityNodeInfoObtain = AccessibilityNodeInfo.obtain(chip);
        C5426n2 c5426n2 = new C5426n2(accessibilityNodeInfoObtain);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        chip.onInitializeAccessibilityNodeInfo(accessibilityNodeInfoObtain);
        ArrayList arrayList = new ArrayList();
        l(arrayList);
        if (accessibilityNodeInfoObtain.getChildCount() > 0 && arrayList.size() > 0) {
            throw new RuntimeException("Views cannot have both real and virtual children");
        }
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c5426n2.a.addChild(chip, ((Integer) arrayList.get(i2)).intValue());
        }
        return c5426n2;
    }

    public abstract void o(int i, @NonNull C5426n2 c5426n2);

    public final boolean p(int i) {
        int i2;
        Chip chip = this.i;
        if ((!chip.isFocused() && !chip.requestFocus()) || (i2 = this.l) == i) {
            return false;
        }
        if (i2 != Integer.MIN_VALUE) {
            j(i2);
        }
        if (i == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i;
        Chip.b bVar = (Chip.b) this;
        if (i == 1) {
            Chip chip2 = Chip.this;
            chip2.r = true;
            chip2.refreshDrawableState();
        }
        q(i, 8);
        return true;
    }

    public final void q(int i, int i2) {
        View view;
        ViewParent parent;
        AccessibilityEvent accessibilityEventObtain;
        if (i == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = (view = this.i).getParent()) == null) {
            return;
        }
        if (i != -1) {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            C5426n2 c5426n2N = n(i);
            accessibilityEventObtain.getText().add(c5426n2N.g());
            AccessibilityNodeInfo accessibilityNodeInfo = c5426n2N.a;
            accessibilityEventObtain.setContentDescription(accessibilityNodeInfo.getContentDescription());
            accessibilityEventObtain.setScrollable(accessibilityNodeInfo.isScrollable());
            accessibilityEventObtain.setPassword(accessibilityNodeInfo.isPassword());
            accessibilityEventObtain.setEnabled(accessibilityNodeInfo.isEnabled());
            accessibilityEventObtain.setChecked(accessibilityNodeInfo.isChecked());
            if (accessibilityEventObtain.getText().isEmpty() && accessibilityEventObtain.getContentDescription() == null) {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
            accessibilityEventObtain.setClassName(accessibilityNodeInfo.getClassName());
            accessibilityEventObtain.setSource(view, i);
            accessibilityEventObtain.setPackageName(view.getContext().getPackageName());
        } else {
            accessibilityEventObtain = AccessibilityEvent.obtain(i2);
            view.onInitializeAccessibilityEvent(accessibilityEventObtain);
        }
        parent.requestSendAccessibilityEvent(view, accessibilityEventObtain);
    }
}
