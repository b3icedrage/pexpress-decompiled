package defpackage;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;

/* JADX INFO: renamed from: Jq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1314Jq {
    public final Context a;
    public C2703aM1<HV1, MenuItem> b;
    public C2703aM1<InterfaceSubMenuC4215hW1, SubMenu> c;

    public AbstractC1314Jq(Context context) {
        this.a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof HV1)) {
            return menuItem;
        }
        HV1 hv1 = (HV1) menuItem;
        if (this.b == null) {
            this.b = new C2703aM1<>();
        }
        MenuItem orDefault = this.b.getOrDefault(hv1, null);
        if (orDefault != null) {
            return orDefault;
        }
        MenuItemC4433iZ0 menuItemC4433iZ0 = new MenuItemC4433iZ0(this.a, hv1);
        this.b.put(hv1, menuItemC4433iZ0);
        return menuItemC4433iZ0;
    }

    public final SubMenu d(SubMenu subMenu) {
        if (!(subMenu instanceof InterfaceSubMenuC4215hW1)) {
            return subMenu;
        }
        InterfaceSubMenuC4215hW1 interfaceSubMenuC4215hW1 = (InterfaceSubMenuC4215hW1) subMenu;
        if (this.c == null) {
            this.c = new C2703aM1<>();
        }
        SubMenu orDefault = this.c.getOrDefault(interfaceSubMenuC4215hW1, null);
        if (orDefault != null) {
            return orDefault;
        }
        SubMenuC3160cU1 subMenuC3160cU1 = new SubMenuC3160cU1(this.a, interfaceSubMenuC4215hW1);
        this.c.put(interfaceSubMenuC4215hW1, subMenuC3160cU1);
        return subMenuC3160cU1;
    }
}
