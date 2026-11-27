package defpackage;

import org.xml.sax.helpers.LocatorImpl;

/* JADX INFO: renamed from: Tw, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2114Tw extends C5914pM {
    @Override // defpackage.C5914pM
    public final Object h() {
        LocatorImpl locatorImpl = ((C3524eC0) this.g).f;
        if (locatorImpl == null) {
            return C3524eC0.class.getName().concat("@NA:NA");
        }
        return C3524eC0.class.getName() + "@" + locatorImpl.getLineNumber() + ":" + locatorImpl.getColumnNumber();
    }
}
