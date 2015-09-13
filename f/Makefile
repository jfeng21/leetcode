ROOT = ..
PLATFORM = $(shell $(ROOT)/systype.sh)
include $(ROOT)/Make.defines.$(PLATFORM)
include $(ROOT)/Make.include

#
# all targets to build...
# we can build them one by one like:
#     make array_to_BST
# or just
#     make all
# to build all targets.
#

#
# all targets...
#
TARGETS = 

all: $(TARGETS)

#array_to_BST: $(BINDIR)/array_to_BST

BINARIES = $(strip $(addprefix $(BINDIR)/, $(TARGETS)))

#
# static pattern rules to make certain target...
#
$(BINARIES): $(BINDIR)/%: $(OBJDIR)/%.o
	$(LINK.c) -o $@ $< $(STDLIBS)

help:
	@echo "Targets to build:"
	@echo "  $(TARGETS)\n"
	@echo "  'make <target>' to build single target;"
	@echo "  'make all' to build whole targets.\n"

.PHONY: all help \
	
