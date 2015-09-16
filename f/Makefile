ROOT = ..
PLATFORM = $(shell $(ROOT)/systype.sh)
include $(ROOT)/Make.defines.$(PLATFORM)
include $(ROOT)/Make.include.j

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
TARGETS = $(SOURCES:.java=.class)

all: $(TARGETS)

help:
	@echo "Targets to build:"
	@echo "  $(TARGETS)\n"
	@echo "  'make <target>' to build single target;"
	@echo "  'make all' to build whole targets.\n"

.PHONY: all help \
	
