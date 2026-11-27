package defpackage;

import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;

/* JADX INFO: renamed from: we0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C7443we0 extends C1746Pd0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7443we0(@NonNull String str, Exception exc) {
        super(str, exc);
        Preconditions.checkNotEmpty(str, "Detail message must not be empty");
    }
}
