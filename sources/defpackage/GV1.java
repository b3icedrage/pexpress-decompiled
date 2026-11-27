package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.h;
import io.sentry.android.core.b0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class GV1 extends MenuInflater {
    public static final Class<?>[] e;
    public static final Class<?>[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] c = {MenuItem.class};
        public Object a;
        public Method b;

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public final boolean onMenuItemClick(MenuItem menuItem) {
            Method method = this.b;
            try {
                Class<?> returnType = method.getReturnType();
                Class<?> cls = Boolean.TYPE;
                Object obj = this.a;
                if (returnType == cls) {
                    return ((Boolean) method.invoke(obj, menuItem)).booleanValue();
                }
                method.invoke(obj, menuItem);
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    public class b {
        public CharSequence A;
        public CharSequence B;
        public final Menu a;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public AbstractC7327w5 z;
        public ColorStateList C = null;
        public PorterDuff.Mode D = null;
        public int b = 0;
        public int c = 0;
        public int d = 0;
        public int e = 0;
        public boolean f = true;
        public boolean g = true;

        public b(Menu menu) {
            this.a = menu;
        }

        public final <T> T a(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, GV1.this.c.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return (T) constructor.newInstance(objArr);
            } catch (Exception e) {
                b0.f("SupportMenuInflater", "Cannot instantiate class: " + str, e);
                return null;
            }
        }

        public final void b(MenuItem menuItem) {
            boolean z = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i = this.v;
            if (i >= 0) {
                menuItem.setShowAsAction(i);
            }
            String str = this.y;
            GV1 gv1 = GV1.this;
            if (str != null) {
                if (gv1.c.isRestricted()) {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
                if (gv1.d == null) {
                    gv1.d = GV1.a(gv1.c);
                }
                Object obj = gv1.d;
                String str2 = this.y;
                a aVar = new a();
                aVar.a = obj;
                Class<?> cls = obj.getClass();
                try {
                    aVar.b = cls.getMethod(str2, a.c);
                    menuItem.setOnMenuItemClickListener(aVar);
                } catch (Exception e) {
                    StringBuilder sbB = C6495s7.b("Couldn't resolve menu item onClick handler ", str2, " in class ");
                    sbB.append(cls.getName());
                    InflateException inflateException = new InflateException(sbB.toString());
                    inflateException.initCause(e);
                    throw inflateException;
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof h) {
                    ((h) menuItem).f(true);
                } else if (menuItem instanceof MenuItemC4433iZ0) {
                    MenuItemC4433iZ0 menuItemC4433iZ0 = (MenuItemC4433iZ0) menuItem;
                    try {
                        Method method = menuItemC4433iZ0.e;
                        HV1 hv1 = menuItemC4433iZ0.d;
                        if (method == null) {
                            menuItemC4433iZ0.e = hv1.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
                        }
                        menuItemC4433iZ0.e.invoke(hv1, Boolean.TRUE);
                    } catch (Exception e2) {
                        b0.f("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str3 = this.x;
            if (str3 != null) {
                menuItem.setActionView((View) a(str3, GV1.e, gv1.a));
                z = true;
            }
            int i2 = this.w;
            if (i2 > 0) {
                if (z) {
                    b0.e("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                } else {
                    menuItem.setActionView(i2);
                }
            }
            AbstractC7327w5 abstractC7327w5 = this.z;
            if (abstractC7327w5 != null) {
                if (menuItem instanceof HV1) {
                    ((HV1) menuItem).a(abstractC7327w5);
                } else {
                    b0.e("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.A;
            boolean z2 = menuItem instanceof HV1;
            if (z2) {
                ((HV1) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C4013gZ0.h(menuItem, charSequence);
            }
            CharSequence charSequence2 = this.B;
            if (z2) {
                ((HV1) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C4013gZ0.m(menuItem, charSequence2);
            }
            char c = this.n;
            int i3 = this.o;
            if (z2) {
                ((HV1) menuItem).setAlphabeticShortcut(c, i3);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C4013gZ0.g(menuItem, c, i3);
            }
            char c2 = this.p;
            int i4 = this.q;
            if (z2) {
                ((HV1) menuItem).setNumericShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                C4013gZ0.k(menuItem, c2, i4);
            }
            PorterDuff.Mode mode = this.D;
            if (mode != null) {
                if (z2) {
                    ((HV1) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    C4013gZ0.j(menuItem, mode);
                }
            }
            ColorStateList colorStateList = this.C;
            if (colorStateList != null) {
                if (z2) {
                    ((HV1) menuItem).setIconTintList(colorStateList);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    C4013gZ0.i(menuItem, colorStateList);
                }
            }
        }
    }

    static {
        Class<?>[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public GV1(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0, types: [GV1] */
    /* JADX WARN: Type inference failed for: r3v15, types: [android.content.res.TypedArray] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public final void b(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        ?? r4;
        int i;
        ?? r8;
        ColorStateList colorStateList;
        int resourceId;
        b bVar = new b(menu);
        int eventType = xmlResourceParser.getEventType();
        do {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (!name.equals("menu")) {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
                eventType = xmlResourceParser.next();
                break;
            }
            eventType = xmlResourceParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == r4) {
                throw new RuntimeException("Unexpected end of document");
            }
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlResourceParser.getName();
                    boolean zEquals = name2.equals("group");
                    GV1 gv1 = GV1.this;
                    if (zEquals) {
                        ?? ObtainStyledAttributes = gv1.c.obtainStyledAttributes(attributeSet, C3855fm1.p);
                        bVar.b = ObtainStyledAttributes.getResourceId(r4, 0);
                        bVar.c = ObtainStyledAttributes.getInt(3, 0);
                        bVar.d = ObtainStyledAttributes.getInt(4, 0);
                        bVar.e = ObtainStyledAttributes.getInt(5, 0);
                        bVar.f = ObtainStyledAttributes.getBoolean(2, r4);
                        bVar.g = ObtainStyledAttributes.getBoolean(0, r4);
                        ObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        Context context = gv1.c;
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3855fm1.q);
                        bVar.i = typedArrayObtainStyledAttributes.getResourceId(2, 0);
                        bVar.j = (typedArrayObtainStyledAttributes.getInt(5, bVar.c) & (-65536)) | (typedArrayObtainStyledAttributes.getInt(6, bVar.d) & 65535);
                        bVar.k = typedArrayObtainStyledAttributes.getText(7);
                        bVar.l = typedArrayObtainStyledAttributes.getText(8);
                        bVar.m = typedArrayObtainStyledAttributes.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes.getString(9);
                        bVar.n = string == null ? (char) 0 : string.charAt(0);
                        bVar.o = typedArrayObtainStyledAttributes.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes.getString(10);
                        bVar.p = string2 == null ? (char) 0 : string2.charAt(0);
                        bVar.q = typedArrayObtainStyledAttributes.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes.hasValue(11)) {
                            bVar.r = typedArrayObtainStyledAttributes.getBoolean(11, false) ? 1 : 0;
                        } else {
                            bVar.r = bVar.e;
                        }
                        bVar.s = typedArrayObtainStyledAttributes.getBoolean(3, false);
                        bVar.t = typedArrayObtainStyledAttributes.getBoolean(4, bVar.f);
                        bVar.u = typedArrayObtainStyledAttributes.getBoolean(1, bVar.g);
                        bVar.v = typedArrayObtainStyledAttributes.getInt(21, -1);
                        bVar.y = typedArrayObtainStyledAttributes.getString(12);
                        bVar.w = typedArrayObtainStyledAttributes.getResourceId(13, 0);
                        bVar.x = typedArrayObtainStyledAttributes.getString(15);
                        String string3 = typedArrayObtainStyledAttributes.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && bVar.w == 0 && bVar.x == null) {
                            bVar.z = (AbstractC7327w5) bVar.a(string3, f, gv1.b);
                        } else {
                            if (z3) {
                                b0.e("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.z = null;
                        }
                        bVar.A = typedArrayObtainStyledAttributes.getText(17);
                        bVar.B = typedArrayObtainStyledAttributes.getText(22);
                        if (typedArrayObtainStyledAttributes.hasValue(19)) {
                            bVar.D = R30.c(typedArrayObtainStyledAttributes.getInt(19, -1), bVar.D);
                        } else {
                            bVar.D = null;
                        }
                        if (typedArrayObtainStyledAttributes.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(18, 0)) == 0 || (colorStateList = C6333rM.getColorStateList(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes.getColorStateList(18);
                            }
                            bVar.C = colorStateList;
                        } else {
                            bVar.C = null;
                        }
                        typedArrayObtainStyledAttributes.recycle();
                        bVar.h = false;
                        xmlResourceParser = xmlResourceParser;
                        r8 = 1;
                    } else if (name2.equals("menu")) {
                        r8 = 1;
                        bVar.h = true;
                        SubMenu subMenuAddSubMenu = bVar.a.addSubMenu(bVar.b, bVar.i, bVar.j, bVar.k);
                        bVar.b(subMenuAddSubMenu.getItem());
                        xmlResourceParser = xmlResourceParser;
                        b(xmlResourceParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlResourceParser = xmlResourceParser;
                        r8 = 1;
                        str = name2;
                        z2 = true;
                    }
                }
                r8 = r4;
                z = z;
            } else if (eventType != 3) {
                r8 = r4;
                z = z;
            } else {
                String name3 = xmlResourceParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlResourceParser = xmlResourceParser;
                    r8 = r4;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        bVar.b = 0;
                        bVar.c = 0;
                        bVar.d = 0;
                        bVar.e = 0;
                        bVar.f = r4;
                        bVar.g = r4;
                    } else if (name3.equals("item")) {
                        if (!bVar.h) {
                            AbstractC7327w5 abstractC7327w5 = bVar.z;
                            if (abstractC7327w5 == null || !abstractC7327w5.a()) {
                                bVar.h = r4;
                                bVar.b(bVar.a.add(bVar.b, bVar.i, bVar.j, bVar.k));
                            } else {
                                bVar.h = r4;
                                bVar.b(bVar.a.addSubMenu(bVar.b, bVar.i, bVar.j, bVar.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        ?? r9 = r4;
                        z = r9 == true ? 1 : 0;
                        r8 = r9;
                    }
                    r8 = r4;
                    z = z;
                }
            }
            eventType = xmlResourceParser.next();
            r4 = r8;
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof FV1)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        try {
            try {
                try {
                    layout = this.c.getResources().getLayout(i);
                    b(layout, Xml.asAttributeSet(layout), menu);
                    layout.close();
                } catch (IOException e2) {
                    throw new InflateException("Error inflating menu XML", e2);
                }
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
