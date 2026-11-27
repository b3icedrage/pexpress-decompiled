package defpackage;

import j$.time.Instant;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class JG1 extends AbstractC3118cG1 {

    @NotNull
    public final Instant d = Instant.now();

    @Override // defpackage.AbstractC3118cG1
    public final long i() {
        Instant instant = this.d;
        return (instant.getEpochSecond() * 1000000000) + ((long) instant.getNano());
    }
}
