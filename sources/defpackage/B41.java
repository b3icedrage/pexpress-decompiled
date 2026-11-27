package defpackage;

import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
public final class B41 {

    @Nullable
    public String a;

    public final synchronized boolean a(@Nullable String str) {
        if (str != null) {
            if (str.length() != 0 && !str.equals(this.a)) {
                this.a = str;
                return true;
            }
        }
        return false;
    }
}
