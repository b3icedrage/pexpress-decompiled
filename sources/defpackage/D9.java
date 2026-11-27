package defpackage;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class D9 extends TF {
    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D9)) {
            return false;
        }
        ((D9) obj).getClass();
        return true;
    }

    public final int hashCode() {
        Boolean.hashCode(false);
        throw null;
    }

    @NotNull
    public final String toString() {
        return "AlertDialogWithCheckBoxParams(checkBoxTextRes=null, disclaimerTextRes=null, actionButtonShouldShowProgressProgressFlow=null, shouldCloseOnActiveAction=false, activeActionBtnCheckBox=null)";
    }
}
